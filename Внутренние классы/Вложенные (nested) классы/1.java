public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вызов метода вложенного класса через интерфейс ===");
        
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.showMessage();
        
        MyInterface.NestedClass.printStatic();
        
        MyInterface.NestedClass another = new MyInterface.NestedClass("Привет из конструктора");
        another.display();
    }
}

interface MyInterface {
    
    void doSomething();
    
    class NestedClass {
        private String message;
        
        public NestedClass() {
            this.message = "Создан через интерфейс";
        }
        
        public NestedClass(String message) {
            this.message = message;
        }
        
        public void showMessage() {
            System.out.println("Метод вложенного класса: " + message);
        }
        
        public static void printStatic() {
            System.out.println("Статический метод вложенного класса в интерфейсе");
        }
        
        public void display() {
            System.out.println("display(): " + message);
        }
    }
}
