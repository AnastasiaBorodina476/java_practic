import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.oldMethod();
        
        SuppressExample example = new SuppressExample();
        example.suppressWarningDemo();
    }
}

class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child display");
    }
    
    @Deprecated
    public void oldMethod() {
        System.out.println("Этот метод устарел, используйте newMethod()");
    }
    
    public void newMethod() {
        System.out.println("Новый метод");
    }
}

class SuppressExample {
    @SuppressWarnings("unchecked")
    public void suppressWarningDemo() {
        List rawList = new ArrayList();
        rawList.add("Строка");
        rawList.add(123);
        
        for (Object obj : rawList) {
            System.out.println("Элемент: " + obj);
        }
    }
}
