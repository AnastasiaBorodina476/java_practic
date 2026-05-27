// ПРИМЕР СОБЛЮДЕНИЯ ПРИНЦИПА ПОДСТАНОВКИ ЛИСКОВ

interface Bird {
    void move();
}

class Sparrow implements Bird {
    @Override
    public void move() {
        System.out.println("Воробей летит");
    }
}

class Penguin implements Bird {
    @Override
    public void move() {
        System.out.println("Пингвин плывет");
    }
}

public class Main {
    public static void makeBirdMove(Bird bird) {
        bird.move();  // Любую птицу можно заменить без изменения поведения
    }
    
    public static void main(String[] args) {
        makeBirdMove(new Sparrow());   // Воробей летит
        makeBirdMove(new Penguin());   // Пингвин плывет
    }
}
