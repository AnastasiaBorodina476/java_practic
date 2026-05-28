public class Main {
    public static void main(String[] args) {
        System.out.println("=== Преобразование между String, StringBuilder, StringBuffer ===\n");
        
        // 1. String -> StringBuilder
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("1. String -> StringBuilder: " + sb);
        
        // 2. String -> StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("2. String -> StringBuffer: " + sbf);
        
        // 3. StringBuilder -> String
        StringBuilder sb2 = new StringBuilder("Java Programming");
        String str2 = sb2.toString();
        System.out.println("3. StringBuilder -> String: " + str2);
        
        // 4. StringBuffer -> String
        StringBuffer sbf2 = new StringBuffer("StringBuffer Example");
        String str3 = sbf2.toString();
        System.out.println("4. StringBuffer -> String: " + str3);
        
        // 5. StringBuilder -> StringBuffer
        StringBuilder sb3 = new StringBuilder("Convert to StringBuffer");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        System.out.println("5. StringBuilder -> StringBuffer: " + sbf3);
        
        // 6. StringBuffer -> StringBuilder
        StringBuffer sbf4 = new StringBuffer("Convert to StringBuilder");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        System.out.println("6. StringBuffer -> StringBuilder: " + sb4);
        
        // 7. Через конструктор String
        String str4 = new String(sb4);
        System.out.println("7. StringBuilder через конструктор String: " + str4);
        
        // 8. Метод append() для преобразования
        StringBuilder sb5 = new StringBuilder();
        sb5.append("String to Builder via append");
        System.out.println("8. append() преобразование: " + sb5);
    }
}
