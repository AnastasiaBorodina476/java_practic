import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Базовый пример: String + String
        String hello = "Привет";
        String world = "мир";
        System.out.println(hello + " " + world);
        
        // String + базовые типы
        String text = "Значение: ";
        
        System.out.println(text + 100);           // int
        System.out.println(text + 3.14);          // double
        System.out.println(text + 'A');           // char
        System.out.println(text + true);          // boolean
        System.out.println(text + 1000L);         // long
        System.out.println(text + 3.14f);         // float
        System.out.println(text + 127);           // byte (автоматически)
        
        // String + объекты
        Integer number = 42;
        Double pi = 3.14159;
        Character letter = 'Z';
        Boolean flag = false;
        
        System.out.println("Объект Integer: " + number);
        System.out.println("Объект Double: " + pi);
        System.out.println("Объект Character: " + letter);
        System.out.println("Объект Boolean: " + flag);
        
        // Смешанная конкатенация
        String name = "Настя";
        int age = 20;
        
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        
        // Важный момент: порядок выполнения
        System.out.println("1 + 2 = " + 1 + 2);     // Результат: "1 + 2 = 12"
        System.out.println(1 + 2 + " = сумма");     // Результат: "3 = сумма"
        
        // С использованием скобок
        System.out.println("Сумма: " + (1 + 2));    // Результат: "Сумма: 3"
        
        // Несколько типов подряд
        int x = 5;
        int y = 10;
        System.out.println(x + " + " + y + " = " + (x + y));
    }
}
