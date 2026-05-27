import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // toString() - преобразует массив в строку
        int[] arr1 = {5, 2, 8, 1, 9, 3};
        System.out.println("toString(arr1): " + Arrays.toString(arr1));
        
        // sort() - сортировка массива
        Arrays.sort(arr1);
        System.out.println("После sort(): " + Arrays.toString(arr1));
        
        // binarySearch() - бинарный поиск (массив должен быть отсортирован)
        int index = Arrays.binarySearch(arr1, 8);
        System.out.println("binarySearch(8): индекс = " + index);
        
        // equals() - сравнение массивов
        int[] arr2 = {1, 2, 3, 5, 8, 9};
        int[] arr3 = {1, 2, 3, 5, 8, 9};
        int[] arr4 = {9, 8, 5, 3, 2, 1};
        
        System.out.println("\nequals(arr2, arr3): " + Arrays.equals(arr2, arr3));
        System.out.println("equals(arr2, arr4): " + Arrays.equals(arr2, arr4));
        
        // compare() - лексикографическое сравнение массивов
        // возвращает 0 - равны, <0 - первый меньше, >0 - первый больше
        int[] arr5 = {1, 2, 3, 4};
        int[] arr6 = {1, 2, 3, 5};
        int[] arr7 = {1, 2, 3};
        
        System.out.println("\ncompare(arr5, arr5): " + Arrays.compare(arr5, arr5));
        System.out.println("compare(arr5, arr6): " + Arrays.compare(arr5, arr6));
        System.out.println("compare(arr5, arr7): " + Arrays.compare(arr5, arr7));
        
        // Дополнительные методы
        // fill() - заполнение массива
        int[] arr8 = new int[5];
        Arrays.fill(arr8, 10);
        System.out.println("\nfill(10): " + Arrays.toString(arr8));
        
        // copyOf() - копирование массива
        int[] arr9 = Arrays.copyOf(arr1, 4);
        System.out.println("copyOf(arr1, 4): " + Arrays.toString(arr9));
        
        // copyOfRange() - копирование диапазона
        int[] arr10 = Arrays.copyOfRange(arr1, 2, 5);
        System.out.println("copyOfRange(2,5): " + Arrays.toString(arr10));
    }
}
