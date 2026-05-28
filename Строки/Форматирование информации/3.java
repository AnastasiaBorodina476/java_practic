import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Форматирование времени и даты ===\n");
        
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        
        // %tH - час в 24-часовом формате (00-23)
        System.out.printf("Час (24-часовой): %tH%n", now);
        
        // %tM - минуты (00-59)
        System.out.printf("Минуты: %tM%n", now);
        
        // %tS - секунды (00-59)
        System.out.printf("Секунды: %tS%n", now);
        
        // %tY - год в четырехзначном формате
        System.out.printf("Год: %tY%n", now);
        
        // %tB - полное название месяца
        System.out.printf("Месяц: %tB%n", now);
        
        // %tA - полное название дня недели
        System.out.printf("День недели: %tA%n", now);
        
        // %tI - час в 12-часовом формате (1-12)
        System.out.printf("Час (12-часовой): %tI%n", now);
        
        // Комбинированный пример
        System.out.printf("%nСегодня: %tA, %tB %td, %tY%n", now, now, now, now);
        System.out.printf("Время: %tH:%tM:%tS%n", now, now, now);
        
        // Использование Calendar
        cal.set(2024, 11, 25, 15, 30, 45);
        System.out.printf("%nУстановленная дата: %tY.%tm.%td %tH:%tM:%tS%n", cal, cal, cal, cal, cal, cal);
    }
}
