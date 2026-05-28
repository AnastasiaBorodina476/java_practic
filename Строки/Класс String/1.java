public class Main {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello java world";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());
        
        // 2. charAt() - возвращает символ по индексу
        System.out.println("2. charAt(6): " + str.charAt(6));
        
        // 3. toLowerCase() - преобразует все символы в нижний регистр
        System.out.println("3. toLowerCase(): " + str.toLowerCase());
        
        // 4. toUpperCase() - преобразует все символы в верхний регистр
        System.out.println("4. toUpperCase(): " + str.toUpperCase());
        
        // 5. trim() - удаляет пробелы в начале и конце строки
        System.out.println("5. trim(): '" + str.trim() + "'");
        
        // 6. substring() - возвращает подстроку
        System.out.println("6. substring(2, 7): " + str.substring(2, 7));
        
        // 7. equals() - сравнивает строки с учетом регистра
        System.out.println("7. equals(str2): " + str.trim().equals(str2));
        
        // 8. equalsIgnoreCase() - сравнивает строки без учета регистра
        System.out.println("8. equalsIgnoreCase(str2): " + str.trim().equalsIgnoreCase(str2));
        
        // 9. contains() - проверяет наличие подстроки
        System.out.println("9. contains(\"Java\"): " + str.contains("Java"));
        
        // 10. replace() - заменяет символы
        System.out.println("10. replace('a', '@'): " + str.replace('a', '@'));
        
        // 11. split() - разбивает строку на массив
        String[] words = str.trim().split(" ");
        System.out.println("11. split(): " + java.util.Arrays.toString(words));
        
        // 12. indexOf() - возвращает индекс первого вхождения
        System.out.println("12. indexOf('J'): " + str.indexOf('J'));
    }
}
