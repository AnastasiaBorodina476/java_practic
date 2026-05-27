public class Main {
    public static void main(String[] args) {
        // decode() преобразует строку в Integer
        // Поддерживает десятичную, шестнадцатеричную и восьмеричную системы
        
        Integer dec = Integer.decode("123");      // десятичная
        System.out.println("decode(\"123\") = " + dec);
        
        Integer hex = Integer.decode("0xFF");     // шестнадцатеричная (0x или #)
        System.out.println("decode(\"0xFF\") = " + hex);
        
        Integer hex2 = Integer.decode("#FF");
        System.out.println("decode(\"#FF\") = " + hex2);
        
        Integer oct = Integer.decode("012");       // восьмеричная (ведущий ноль)
        System.out.println("decode(\"012\") = " + oct);
        
        Integer negative = Integer.decode("-123");
        System.out.println("decode(\"-123\") = " + negative);
        
        Integer positive = Integer.decode("+123");
        System.out.println("decode(\"+123\") = " + positive);
        
        // Пример с Long
        Long longDec = Long.decode("0x1F");
        System.out.println("Long.decode(\"0x1F\") = " + longDec);
    }
}
