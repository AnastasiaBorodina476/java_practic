public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Перегрузка методов (overloading) ===");
        System.out.println("sum(int, int): " + calc.sum(5, 10));
        System.out.println("sum(int, int, int): " + calc.sum(5, 10, 15));
        System.out.println("sum(double, double): " + calc.sum(5.5, 10.5));
        System.out.println("sum(String, String): " + calc.sum("5", "10"));
        
        System.out.println("\n=== Переопределение методов (override) ===");
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        animal.sound();
        dog.sound();
        cat.sound();
        
        System.out.println("\n=== Полиморфизм ===");
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}

class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    public double sum(double a, double b) {
        return a + b;
    }
    
    public int sum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}

class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака лает: Гав-гав!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Кошка мяукает: Мяу-мяу!");
    }
}
