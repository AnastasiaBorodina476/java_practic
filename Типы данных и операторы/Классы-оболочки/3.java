public class Main {
    public static void main(String[] args) {
        // NullPointerException возникает при автораспаковке null-объекта
        
        Integer nullInteger = null;
        
        // Попытка автораспаковки null -> int
        // Здесь будет брошено NullPointerException
        try {
            int value = nullInteger;  // unboxing null
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e);
        }
        
        // Другой пример - арифметическая операция
        Integer a = null;
        Integer b = 10;
        
        try {
            Integer result = a + b;  // сначала unboxing a (null) -> NPE
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка при операции: " + e);
        }
        
        // Пример со сравнением
        Integer x = null;
        
        try {
            if (x > 5) {  // unboxing null -> NPE
                System.out.println("Больше");
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка при сравнении: " + e);
        }
        
        // БЕЗ ошибки - сравнение объектов, а не значений
        Integer y = null;
        if (y == null) {  // нет unboxing, просто сравнение ссылок
            System.out.println("\ny == null: true (ошибки нет)");
        }
        
        // БЕЗ ошибки - автоупаковка не вызывает NPE
        Integer z = null;  // это просто присваивание, не unboxing
        System.out.println("z = " + z);
    }
}
