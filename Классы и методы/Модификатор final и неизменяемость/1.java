class A {
    public final int a;
    
    public A() {
        a = 10;
    }
    
    public A(int value) {
        a = value;
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.a);
        
        A obj2 = new A(30);
        System.out.println(obj2.a);
    }
}
