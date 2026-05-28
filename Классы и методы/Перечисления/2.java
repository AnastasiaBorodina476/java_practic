public class Main {
    public static void main(String[] args) {
        for (Level level : Level.values()) {
            System.out.println(level + ": код = " + level.getCode() + ", описание = " + level.getDescription());
        }
        
        Level high = Level.HIGH;
        System.out.println("\nПроверка уровня: " + high);
        System.out.println(high.isAvailable());
        
        System.out.println("\nПоиск по коду 2: " + Level.fromCode(2));
    }
}

enum Level {
    LOW(1, "Низкий уровень", true),
    MEDIUM(2, "Средний уровень", true),
    HIGH(3, "Высокий уровень", true),
    ADMIN(4, "Администратор", false);
    
    private final int code;
    private final String description;
    private final boolean available;
    
    Level(int code, String description, boolean available) {
        this.code = code;
        this.description = description;
        this.available = available;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public static Level fromCode(int code) {
        for (Level level : Level.values()) {
            if (level.code == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Код не найден: " + code);
    }
}
