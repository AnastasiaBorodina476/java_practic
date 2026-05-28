public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}

interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA: show");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB: show");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        System.out.println("=== Разрешение конфликта ===");
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("MyClass: собственная реализация");
    }
}
