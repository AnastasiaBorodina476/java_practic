import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("10\n");
            writer.write("20.5\n");
            writer.write("Hello Scanner!\n");
            writer.write("Java,Programming,Example\n");
            writer.close();
            System.out.println("Файл создан и заполнен данными\n");
            
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
        
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("=== Чтение данных из файла ===\n");
            
            int number = scanner.nextInt();
            System.out.println("Целое число: " + number);
            
            double d = scanner.nextDouble();
            System.out.println("Дробное число: " + d);
            
            scanner.nextLine();
            String line = scanner.nextLine();
            System.out.println("Строка: " + line);
            
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println("Токен: " + token);
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
