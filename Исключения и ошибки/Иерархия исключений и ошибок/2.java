public class Main {
    public static void main(String[] args) {
        
        // 1. ArithmeticException - деление на ноль
        System.out.println("=== ArithmeticException ===");
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль - " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        System.out.println("\n=== ArrayIndexOutOfBoundsException ===");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива - " + e.getMessage());
        }
        
        // 3. IllegalArgumentException - недопустимый аргумент
        System.out.println("\n=== IllegalArgumentException ===");
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: недопустимый аргумент - " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типов
        System.out.println("\n=== ClassCastException ===");
        try {
            Object obj = "Это строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка: неверное приведение типа - " + e.getMessage());
        }
        
        // 5. NullPointerException - обращение к null-объекту
        System.out.println("\n=== NullPointerException ===");
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: обращение к null-объекту - " + e.getMessage());
        }
    }
    
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст установлен: " + age);
    }
}
