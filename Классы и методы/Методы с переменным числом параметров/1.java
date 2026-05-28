public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.printValues(new int[]{1, 2, 3});
        calc.printValues(new String[]{"A", "B", "C"});
        calc.printValues(new double[]{1.5, 2.5, 3.5});
        calc.printValues(new Object[]{1, "Hello", 3.14});
    }
}

class Calculator {
    
    public void printValues(int... numbers) {
        System.out.print("int...: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void printValues(String... strings) {
        System.out.print("String...: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    public void printValues(double... doubles) {
        System.out.print("double...: ");
        for (double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    
    public void printValues(Object... objects) {
        System.out.print("Object...: ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
