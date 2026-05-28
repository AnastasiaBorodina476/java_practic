public class Main {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
    
    public void testSameClass() {
        System.out.println("=== Внутри того же класса ===");
        System.out.println("privateVar: " + privateVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.testSameClass();
        
        System.out.println("\n=== Тот же класс ===");
        System.out.println("privateVar: " + obj.privateVar);
        System.out.println("defaultVar: " + obj.defaultVar);
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("publicVar: " + obj.publicVar);
        
        SamePackage sp = new SamePackage();
        sp.test();
        
        // Подкласс
        SubClass sub = new SubClass();
        sub.test();
        
        // Другой класс
        OtherClass other = new OtherClass();
        other.test();
    }
}

class SamePackage {
    public void test() {
        Main obj = new Main();
        System.out.println("\n=== Тот же пакет ===");
        System.out.println("defaultVar: " + obj.defaultVar);
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("publicVar: " + obj.publicVar);
    }
}

class SubClass extends Main {
    public void test() {
        System.out.println("\n=== Подкласс ===");
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
}

class OtherClass {
    public void test() {
        Main obj = new Main();
        System.out.println("\n=== Другой класс ===");
        System.out.println("publicVar: " + obj.publicVar);
    }
}
