public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.print();
    }
}

final class FinalClass {
    public void print() {
        System.out.println("Это final-класс, от него нельзя наследоваться");
    }
}

// Ошибка компиляции!
// class ChildClass extends FinalClass {
//     
// }
