import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        
        dogs.add(new Dog());
        dogs.add(new Dog());
        animals.add(new Animal());
        animals.add(new Dog());
        
        System.out.println("=== <? extends T> - Producer Extends ===");
        readAnimals(dogs);
        readAnimals(animals);
        
        System.out.println("\n=== <? super T> - Consumer Super ===");
        addDog(animals);
        addDog(objects);
        
        System.out.println("\n=== PECS принцип ===");
        List<Animal> dest = new ArrayList<>();
        copyAnimals(dogs, dest);
        
        System.out.println("\n=== Пример с Wrapper ===");
        Wrapper<Dog> dogWrapper = new Wrapper<>();
        dogWrapper.setItem(new Dog());
        printWrapper(dogWrapper);
    }
    
    public static void readAnimals(List<? extends Animal> list) {
        Animal a = list.get(0);
        System.out.println("Читаем: " + a);
    }
    
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog());
        System.out.println("Добавили собаку");
    }
    
    public static void copyAnimals(List<? extends Animal> src, List<? super Animal> dest) {
        for (Animal a : src) {
            dest.add(a);
        }
        System.out.println("Скопировали");
    }
    
    public static void printWrapper(Wrapper<? extends Animal> wrapper) {
        Animal a = wrapper.getItem();
        System.out.println("Wrapper содержит: " + a);
    }
}

class Wrapper<T> {
    private T item;
    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}

class Animal {
    public String toString() { return "Animal"; }
}

class Dog extends Animal {
    public String toString() { return "Dog"; }
}
