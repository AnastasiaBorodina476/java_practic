public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class Parent {
    public final void show() {
        System.out.println("Родительский метод final - нельзя переопределить");
    }
}

class Child extends Parent {
    // Ошибка компиляции!
    // public void show() {
    //     System.out.println("Попытка переопределить final-метод");
    // }
}
