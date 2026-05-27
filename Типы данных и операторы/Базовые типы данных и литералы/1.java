public class Main {
    // Члены класса (автоматически получают нулевые значения)
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean boolVar;
    
    public static void main(String[] args) {
        // Примеры всех типов с инициализацией
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14159265359;
        char c = 'A';
        boolean bool = true;
        
        System.out.println("Инициализированные значения:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        
        System.out.println("\nНулевые значения (члены класса):");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: [" + charVar + "] (код: " + (int)charVar + ")");
        System.out.println("boolean: " + boolVar);
    }
}
