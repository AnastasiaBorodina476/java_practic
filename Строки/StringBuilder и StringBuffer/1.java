public class Main {
    public static void main(String[] args) {
        System.out.println("=== StringBuilder методы ===\n");
        
        // 1. append() - добавляет строку в конец
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("1. append(): " + sb);
        
        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, " Java");
        System.out.println("2. insert(5, ' Java'): " + sb);
        
        // 3. delete() - удаляет символы с start до end
        sb.delete(5, 10);
        System.out.println("3. delete(5, 10): " + sb);
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(5): " + sb);
        
        // 5. replace() - заменяет часть строки
        sb.replace(0, 5, "Hi");
        System.out.println("5. replace(0, 5, 'Hi'): " + sb);
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse(): " + sb);
        sb.reverse();
        
        // 7. length() - возвращает длину
        System.out.println("7. length(): " + sb.length());
        
        // 8. charAt() - возвращает символ по индексу
        System.out.println("8. charAt(1): " + sb.charAt(1));
        
        // 9. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("9. setCharAt(0, 'h'): " + sb);
        
        // 10. substring() - возвращает подстроку
        System.out.println("10. substring(1, 4): " + sb.substring(1, 4));
        
        // 11. indexOf() - ищет подстроку
        System.out.println("11. indexOf('or'): " + sb.indexOf("or"));
        
        // 12. capacity() - возвращает текущую емкость
        System.out.println("12. capacity(): " + sb.capacity());
        
        System.out.println("\n=== StringBuffer (аналогичен StringBuilder, но потокобезопасен) ===");
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("StringBuffer append(): " + sbf);
    }
}
