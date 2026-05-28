public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Овчарка");
        dog.display();
    }
}

class Animal {
    String name;
    int age;
    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Конструктор Animal");
    }
    
    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    String breed;
    
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Конструктор Dog");
    }
    
    void display() {
        System.out.println("\n=== Демонстрация super ===");
        
        System.out.println("1. Доступ к полю суперкласса: name = " + super.name);
        System.out.println("   Доступ к полю суперкласса: age = " + super.age);
        
        System.out.print("2. Доступ к методу суперкласса: ");
        super.makeSound();
        
        System.out.println("3. Вызов конструктора суперкласса уже выполнен (super(name, age))");
    }
}
