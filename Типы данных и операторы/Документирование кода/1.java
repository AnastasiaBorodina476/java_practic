/**
 * Демонстрация принципа подстановки Лисков (LSP)
 * 
 * @author Студент
 * @version 1.0
 */
public class Main {
    
    /**
     * Базовый интерфейс для всех птиц
     */
    interface Bird {
        void move();
    }
    
    /**
     * Воробей - летающая птица
     */
    static class Sparrow implements Bird {
        @Override
        public void move() {
            System.out.println("Воробей летит");
        }
    }
    
    /**
     * Пингвин - нелетающая птица, но умеет плавать
     */
    static class Penguin implements Bird {
        @Override
        public void move() {
            System.out.println("Пингвин плывет");
        }
    }
    
    /**
     * Метод работает с любым объектом Bird
     * Принцип LSP: подклассы можно подставлять вместо родителя
     * 
     * @param bird любая птица
     */
    public static void makeBirdMove(Bird bird) {
        bird.move();  // Полиморфный вызов
    }
    
    public static void main(String[] args) {
        // Подстановка Sparrow вместо Bird
        makeBirdMove(new Sparrow());   // Воробей летит
        
        // Подстановка Penguin вместо Bird
        makeBirdMove(new Penguin());   // Пингвин плывет
    }
}
