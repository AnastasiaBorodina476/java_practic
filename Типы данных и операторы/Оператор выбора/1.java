public class Main {
    public static void main(String[] args) {
        // 1. byte
        byte b = 1;
        switch(b) {
            case 1: System.out.println("byte: 1"); break;
            default: System.out.println("byte default");
        }
        
        // 2. short
        short s = 2;
        switch(s) {
            case 2: System.out.println("short: 2"); break;
            default: System.out.println("short default");
        }
        
        // 3. char
        char c = 'A';
        switch(c) {
            case 'A': System.out.println("char: A"); break;
            default: System.out.println("char default");
        }
        
        // 4. int
        int i = 3;
        switch(i) {
            case 3: System.out.println("int: 3"); break;
            default: System.out.println("int default");
        }
        
        // 5. String
        String str = "hello";
        switch(str) {
            case "hello": System.out.println("String: hello"); break;
            default: System.out.println("String default");
        }
        
        // 6. enum
        Day day = Day.MONDAY;
        switch(day) {
            case MONDAY: System.out.println("enum: MONDAY"); break;
            default: System.out.println("enum default");
        }
        
        // 7. Integer (оболочка) - автораспаковка
        Integer intWrapper = 4;
        switch(intWrapper) {
            case 4: System.out.println("Integer: 4"); break;
            default: System.out.println("Integer default");
        }
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
