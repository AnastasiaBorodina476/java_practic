public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // instanceof с классами
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal));
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
        
        // instanceof с null
        Dog nullDog = null;
        System.out.println("\nnullDog instanceof Dog: " + (nullDog instanceof Dog));
        System.out.println("null instanceof Object: " + (null instanceof Object));
        
        // instanceof с интерфейсами
        System.out.println("\ndog instanceof Pet: " + (dog instanceof Pet));
        System.out.println("cat instanceof Pet: " + (cat instanceof Pet));
        
        // instanceof с массивами
        String[] arr = new String[5];
        System.out.println("\narr instanceof String[]: " + (arr instanceof String[]));
        System.out.println("arr instanceof Object: " + (arr instanceof Object));
    }
}

class Animal {}
class Dog extends Animal implements Pet {}
class Cat extends Animal implements Pet {}
interface Pet {}
