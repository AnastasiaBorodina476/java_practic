import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Пример 1: Базовые типы
        var number = 42;           // компилятор определяет int
        var text = "Привет";       // String
        var pi = 3.14159;          // double
        var flag = true;           // boolean
        var letter = 'A';          // char
        
        System.out.println("number: " + number + " (тип: int)");
        System.out.println("text: " + text + " (тип: String)");
        System.out.println("pi: " + pi + " (тип: double)");
        
        // Пример 2: Коллекции
        var list = new ArrayList<String>();     // ArrayList<String>
        list.add("Элемент 1");
        list.add("Элемент 2");
        
        var map = new HashMap<String, Integer>();  // HashMap<String, Integer>
        map.put("один", 1);
        map.put("два", 2);
        
        System.out.println("list: " + list);
        System.out.println("map: " + map);
        
        // Пример 3: В циклах
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (var num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Пример 4: Сложные типы
        var listOfLists = new ArrayList<List<String>>();
        var innerList = new ArrayList<String>();
        innerList.add("вложенный");
        listOfLists.add(innerList);
        
        // Пример 5: Результат метода
        var result = getSum(10, 20);  // int
        System.out.println("Результат: " + result);
    }
    
    public static int getSum(int a, int b) {
        return a + b;
    }
}
