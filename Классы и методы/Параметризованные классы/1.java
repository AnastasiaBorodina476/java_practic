import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>();
        Wrapper<Integer> integerWrapper = new Wrapper<>();
        Wrapper<Double> doubleWrapper = new Wrapper<>();
        
        System.out.println("=== instanceof с параметризованными классами ===");
        
        System.out.println(stringWrapper instanceof Wrapper);
        System.out.println(integerWrapper instanceof Wrapper);
        
        System.out.println(stringWrapper instanceof Wrapper<?>);
        System.out.println(integerWrapper instanceof Wrapper<?>);
        
        List<String> list = new ArrayList<>();
        System.out.println(list instanceof List);
        System.out.println(list instanceof List<?>);
        
        Wrapper<String> nullWrapper = null;
        System.out.println(nullWrapper instanceof Wrapper);
        System.out.println(nullWrapper instanceof Wrapper<?>);
        
        System.out.println("\n=== <? extends T> и <? super T> ===");
        
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        
        dogs.add(new Dog());
        dogs.add(new Dog());
        animals.add(new Animal());
        animals.add(new Dog());
        
        System.out.println("Чтение с extends (можно читать, нельзя писать):");
        readAnimals(dogs);
        
        System.out.println("\nЗапись с super (можно писать, читать как Object):");
        addDog(animals);
        
        System.out.println("\nPECS (Producer Extends, Consumer Super):");
        List<Animal> animalList = new ArrayList<>();
        copyAnimals(dogs, animalList);
        
        Wrapper<Dog> dogWrapper = new Wrapper<>();
        dogWrapper.setItem(new Dog());
        printWrapperItem(dogWrapper);
    }
    
    public static void readAnimals(List<? extends Animal> list) {
        if (!list.isEmpty()) {
            Animal a = list.get(0);
            System.out.println("Читаем животное: " + a);
        }
    }
    
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog());
        System.out.println("Добавили собаку");
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            System.out.println("Первый элемент: " + obj);
        }
    }
    
    public static void copyAnimals(List<? extends Animal> src, List<? super Animal> dest) {
        for (Animal a : src) {
            dest.add(a);
        }
        System.out.println("Скопировали животных");
    }
    
    public static void printWrapperItem(Wrapper<? extends Animal> wrapper) {
        Animal item = wrapper.getItem();
        System.out.println("Животное в wrapper: " + item);
    }
}

class Wrapper<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}

class Animal {
    public String toString() {
        return "Animal";
    }
}

class Dog extends Animal {
    public String toString() {
        return "Dog";
    }
}

class Cat extends Animal {
    public String toString() {
        return "Cat";
    }
}
