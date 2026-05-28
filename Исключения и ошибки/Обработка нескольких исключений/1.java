public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Ситуация 1: Исключения обрабатываются идентично ===");
        processData("abc");
        processData(null);
        processData(new int[]{1, 2, 3});
        
        System.out.println("\n=== Ситуация 2: Иерархия исключений ===");
        processNumber(0);
        processNumber(null);
        processNumber("abc");
    }
    
    public static void processData(Object data) {
        try {
            if (data instanceof String) {
                String str = (String) data;
                System.out.println("Длина строки: " + str.length());
            } else if (data == null) {
                throw new NullPointerException("Данные равны null");
            } else {
                int[] arr = (int[]) data;
                System.out.println("Элемент [5]: " + arr[5]);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение обработано: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
    
    public static void processNumber(Object num) {
        try {
            if (num == null) {
                throw new IllegalArgumentException("Число не может быть null");
            } else if (num instanceof String) {
                throw new NumberFormatException("Неверный формат числа");
            } else if ((int) num == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException (дочерний): " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException (дочерний): " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException (родительский): " + e.getMessage());
        }
    }
}
