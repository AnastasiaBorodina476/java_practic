public class Main {
    public static void main(String[] args) {
        
        // Пример 1: double → int (потеря дробной части)
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("double (3.14159) → int: " + intPi);
        System.out.println("Потеряна дробная часть .14159\n");
        
        // Пример 2: double → long (потеря дробной части)
        double largeDouble = 123.987;
        long longVal = (long) largeDouble;
        System.out.println("double (123.987) → long: " + longVal);
        System.out.println("Потеряна дробная часть .987\n");
        
        // Пример 3: long → int (переполнение)
        long bigLong = 3000000000L;  // больше максимального int (2.147 млрд)
        int intFromLong = (int) bigLong;
        System.out.println("long (3000000000) → int: " + intFromLong);
        System.out.println("Переполнение: 3000000000 - 4294967296 = -1294967296\n");
        
        // Пример 4: int → byte (переполнение)
        int largeInt = 200;
        byte byteVal = (byte) largeInt;
        System.out.println("int (200) → byte: " + byteVal);
        System.out.println("200 - 256 = -56\n");
        
        // Пример 5: int → short (переполнение)
        int bigInt = 40000;
        short shortVal = (short) bigInt;
        System.out.println("int (40000) → short: " + shortVal);
        System.out.println("40000 - 65536 = -25536\n");
        
        // Пример 6: double → float (потеря точности)
        double preciseDouble = 1.23456789123456789;
        float floatVal = (float) preciseDouble;
        System.out.println("double (1.23456789123456789) → float: " + floatVal);
        System.out.println("Потеряна точность (float хранит ~7 знаков)\n");
        
        // Пример 7: char → byte (сохранение кода в пределах -128..127)
        char letterA = 'A';  // код 65
        byte byteFromChar = (byte) letterA;
        System.out.println("char ('A' = 65) → byte: " + byteFromChar);
        
        char letterZ = 'Z';  // код 90
        byte byteFromZ = (byte) letterZ;
        System.out.println("char ('Z' = 90) → byte: " + byteFromZ);
        
        char euroSymbol = '€';  // код 8364 (выходит за пределы byte)
        byte byteFromEuro = (byte) euroSymbol;
        System.out.println("char ('€' = 8364) → byte: " + byteFromEuro);
        System.out.println("8364 % 256 = 172, но byte со знаком: 172 - 256 = -84\n");
        
        // Пример 8: int → char (явное преобразование)
        int asciiCode = 65;
        char charFromInt = (char) asciiCode;
        System.out.println("int (65) → char: '" + charFromInt + "'\n");
        
        // Пример 9: float → int (отбрасывание дробной части)
        float temperature = 36.6f;
        int intTemp = (int) temperature;
        System.out.println("float (36.6) → int: " + intTemp);
        
        // Пример 10: short → byte (переполнение)
        short shortVal2 = 130;
        byte byteFromShort = (byte) shortVal2;
        System.out.println("short (130) → byte: " + byteFromShort);
        System.out.println("130 - 256 = -126");
    }
}
