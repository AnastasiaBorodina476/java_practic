import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== StringJoiner с разделителем ===");
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко");
        sj1.add("Груша");
        sj1.add("Банан");
        System.out.println(sj1);
        
        System.out.println("\n=== StringJoiner с префиксом и суффиксом ===");
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Красный");
        sj2.add("Синий");
        sj2.add("Зеленый");
        System.out.println(sj2);
        
        System.out.println("\n=== Объединение двух StringJoiner ===");
        StringJoiner sj3 = new StringJoiner("; ", "{", "}");
        sj3.add("Один");
        sj3.add("Два");
        
        StringJoiner sj4 = new StringJoiner("; ", "{", "}");
        sj4.add("Три");
        sj4.add("Четыре");
        
        sj3.merge(sj4);
        System.out.println(sj3);
        
        System.out.println("\n=== StringJoiner с пустым значением ===");
        StringJoiner sj5 = new StringJoiner(", ");
        System.out.println("Пустой: " + sj5);
        System.out.println("Длина: " + sj5.length());
        
        sj5.setEmptyValue("Нет элементов");
        System.out.println("После setEmptyValue: " + sj5);
    }
}
