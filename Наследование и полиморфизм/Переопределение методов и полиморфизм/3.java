public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
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
}

// class ChildWithError extends Parent {
//     @Override
//     public void show() {
//         System.out.println("Error - no method show() in Parent");
//     }
// }
