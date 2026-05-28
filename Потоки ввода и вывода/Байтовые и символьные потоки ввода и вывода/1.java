import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69};
        
        try (InputStream input = new ByteArrayInputStream(data)) {
            System.out.println("=== Метод read() ===\n");
            
            int byte1 = input.read();
            System.out.println("Прочитан байт: " + byte1 + " -> символ: " + (char)byte1);
            
            int byte2 = input.read();
            System.out.println("Прочитан байт: " + byte2 + " -> символ: " + (char)byte2);
            
            int byte3 = input.read();
            System.out.println("Прочитан байт: " + byte3 + " -> символ: " + (char)byte3);
            
            byte[] buffer = new byte[5];
            int bytesRead = input.read(buffer);
            System.out.println("\nread(buffer): прочитано " + bytesRead + " байт: " + Arrays.toString(buffer));
            
            int end = input.read();
            System.out.println("\nread() при достижении конца: " + end);
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
