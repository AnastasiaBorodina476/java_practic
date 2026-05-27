public class Main {
    public static void main(String[] args) {
        // 1. Через конструктор (устаревший, но работает)
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        System.out.println("new Boolean(true): " + b1);
        System.out.println("new Boolean(\"true\"): " + b2);
        
        // 2. Через valueOf() (рекомендуемый способ)
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf("true");
        Boolean b5 = Boolean.valueOf("TRUE");
        Boolean b6 = Boolean.valueOf("false");
        System.out.println("\nBoolean.valueOf(true): " + b3);
        System.out.println("Boolean.valueOf(\"true\"): " + b4);
        System.out.println("Boolean.valueOf(\"TRUE\"): " + b5);
        System.out.println("Boolean.valueOf(\"false\"): " + b6);
        
        // 3. Через parseBoolean()
        boolean b7 = Boolean.parseBoolean("true");
        boolean b8 = Boolean.parseBoolean("false");
        System.out.println("\nBoolean.parseBoolean(\"true\"): " + b7);
        System.out.println("Boolean.parseBoolean(\"false\"): " + b8);
        
        // 4. Автоупаковка (boxing)
        Boolean b9 = true;
        Boolean b10 = false;
        System.out.println("\nАвтоупаковка: " + b9 + ", " + b10);
        
        // 5. Получение констант
        Boolean b11 = Boolean.TRUE;
        Boolean b12 = Boolean.FALSE;
        System.out.println("\nBoolean.TRUE: " + b11);
        System.out.println("Boolean.FALSE: " + b12);
        
        // 6. Результат логического выражения
        Boolean b13 = 10 > 5;
        Boolean b14 = "text".equals("Text");
        System.out.println("\n10 > 5: " + b13);
        System.out.println("\"text\".equals(\"Text\"): " + b14);
    }
}
