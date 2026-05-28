public class Main {
    public static void main(String[] args) {
        System.out.println("=== Программа запущена ===\n");
        
        // Перехваченное исключение
        try {
            System.out.println("Попытка выполнить деление...");
            int result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение ПЕРЕХВАЧЕНО: " + e.getMessage());
        }
        
        System.out.println("\nПрограмма продолжает работу после перехвата\n");
        
        // Неперехваченное исключение - приведет к аварийной остановке
        System.out.println("Попытка получить элемент из массива...");
        getArrayElement();
        
        System.out.println("Эта строка не будет выведена");
    }
    
    public static int divide(int a, int b) {
        return a / b;
    }
    
    public static void getArrayElement() {
        int[] arr = {1, 2, 3};
        System.out.println("Элемент с индексом 10: " + arr[10]);
    }
}
