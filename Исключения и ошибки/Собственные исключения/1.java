public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(100);
            
            try {
                account.withdraw(50);
                System.out.println("Снято 50. Баланс: " + account.getBalance());
                
                account.withdraw(200);
                System.out.println("Снято 200. Баланс: " + account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Недостающая сумма: " + e.getMissingAmount());
            }
            
            try {
                BankAccount emptyAccount = new BankAccount(-10);
            } catch (NegativeBalanceException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            
        } catch (NegativeBalanceException e) {
            System.out.println("Ошибка при создании счета: " + e.getMessage());
        }
    }
}

class InsufficientFundsException extends Exception {
    private double missingAmount;
    
    public InsufficientFundsException() {
        super("Недостаточно средств на счете");
    }
    
    public InsufficientFundsException(String message) {
        super(message);
    }
    
    public InsufficientFundsException(String message, double missingAmount) {
        super(message);
        this.missingAmount = missingAmount;
    }
    
    public double getMissingAmount() {
        return missingAmount;
    }
}

class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super("Баланс не может быть отрицательным");
    }
    
    public NegativeBalanceException(String message) {
        super(message);
    }
    
    public NegativeBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) throws NegativeBalanceException {
        if (initialBalance < 0) {
            throw new NegativeBalanceException("Начальный баланс не может быть отрицательным: " + initialBalance);
        }
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double missing = amount - balance;
            throw new InsufficientFundsException("Недостаточно средств. Доступно: " + balance + ", запрошено: " + amount, missing);
        }
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
}
