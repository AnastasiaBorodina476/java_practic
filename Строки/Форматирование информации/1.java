import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Спецификаторы форматирования ===\n");
        
        // %d - десятичное целое
        System.out.printf("%d + %d = %d%n", 10, 20, 30);
        
        // %f - число с плавающей точкой
        System.out.printf("Число Pi: %.2f%n", 3.1415926535);
        
        // %s - строковое представление
        System.out.printf("Привет, %s!%n", "Мир");
        
        // %b - логическое значение
        System.out.printf("10 > 5: %b%n", (10 > 5));
        System.out.printf("10 < 5: %b%n", (10 < 5));
        
        // %n - новая строка
        System.out.printf("Первая строка%nВторая строка%n");
        
        // %% - вставка знака процента
        System.out.printf("Скидка 50%%%n");
        
        // Использование Formatter
        Formatter formatter = new Formatter();
        formatter.format("Результат: %d * %d = %d", 8, 7, 56);
        System.out.println(formatter);
        formatter.close();
    }
}
