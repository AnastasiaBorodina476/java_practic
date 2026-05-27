public class Main {
    public static void main(String[] args) {
        
        // Пример 1: byte + short = int
        byte b = 10;
        short s = 20;
        int result1 = b + s;
        System.out.println("byte (10) + short (20) = int (" + result1 + ")");
        System.out.println("Объяснение: byte и short автоматически расширяются до int\n");
        
        // Пример 2: int + long = long
        int i = 100;
        long l = 200L;
        long result2 = i + l;
        System.out.println("int (100) + long (200) = long (" + result2 + ")");
        System.out.println("Объяснение: int расширяется до long, так как long больше\n");
        
        // Пример 3: long + float = float
        long lg = 1000L;
        float f = 5.5f;
        float result3 = lg + f;
        System.out.println("long (1000) + float (5.5) = float (" + result3 + ")");
        System.out.println("Объяснение: long преобразуется во float\n");
        
        // Пример 4: float + double = double
        float fl = 3.14f;
        double d = 2.718;
        double result4 = fl + d;
        System.out.println("float (3.14) + double (2.718) = double (" + result4 + ")");
        System.out.println("Объяснение: float расширяется до double\n");
        
        // Пример 5: int + double = double
        int num = 42;
        double pi = 3.14159;
        double result5 = num + pi;
        System.out.println("int (42) + double (3.14159) = double (" + result5 + ")");
        System.out.println("Объяснение: int преобразуется в double\n");
        
        // Пример 6: char + int = int
        char ch = 'A';  // код 65
        int code = 32;
        int result6 = ch + code;
        System.out.println("char ('A'=65) + int (32) = int (" + result6 + ")");
        System.out.println("Объяснение: char преобразуется в int (код символа)\n");
        
        // Пример 7: byte + double = double
        byte bt = 5;
        double db = 2.5;
        double result7 = bt * db;
        System.out.println("byte (5) * double (2.5) = double (" + result7 + ")");
        
        // Правило: результат всегда имеет тип большего операнда
        System.out.println("\n--- ПРАВИЛО ---");
        System.out.println("Тип результата = наибольший тип среди операндов");
        System.out.println("Цепочка расширения: byte → short → int → long → float → double");
    }
}
