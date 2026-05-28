public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        System.out.println("=== Вызов методов ===");
        
        obj.defaultMethod();
        
        obj.abstractMethod();
        
        MyInterface.staticMethod();
        
        MyInterface another = new MyClass();
        another.defaultMethod();
    }
}

interface MyInterface {
    void abstractMethod();
    
    default void defaultMethod() {
        System.out.println("Default метод в интерфейсе");
    }
    
    static void staticMethod() {
        System.out.println("Static метод в интерфейсе");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Реализация абстрактного метода");
    }
    
    @Override
    public void defaultMethod() {
        System.out.println("Переопределенный default метод");
    }
}
