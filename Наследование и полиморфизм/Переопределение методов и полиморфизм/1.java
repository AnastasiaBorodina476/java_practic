public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
        System.out.println(calc.add(5.5, 10.5));
        System.out.println(calc.add("5", "10"));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
