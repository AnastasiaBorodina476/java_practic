import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try (OutputStream output = new ByteArrayOutputStream()) {
            System.out.println("=== Метод write(int) ===\n");
            
            output.write(65);
            output.write(66);
            output.write(67);
            
            System.out.println("Записаны байты: 65(A), 66(B), 67(C)");
            
            byte[] data = {68, 69, 70};
            output.write(data);
            System.out.println("Записан массив: " + java.util.Arrays.toString(data));
            
            output.write(data, 0, 2);
            System.out.println("Записаны первые 2 байта из массива: 68(D), 69(E)");
            
            String result = output.toString();
            System.out.println("\nРезультат: " + result);
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
