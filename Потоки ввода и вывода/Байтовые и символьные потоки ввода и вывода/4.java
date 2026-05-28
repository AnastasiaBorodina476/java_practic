import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Пример AutoCloseable ===\n");
        
        readFile();
    }
    
    public static void readFile() {
        String fileName = "example.txt";
        
        try (CustomResource resource = new CustomResource();
             FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
             
            resource.use();
            String line = br.readLine();
            System.out.println("Прочитано: " + line);
            
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class CustomResource implements AutoCloseable {
    
    public void use() {
        System.out.println("Использование ресурса");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Ресурс автоматически закрыт (close() вызван)");
    }
}
