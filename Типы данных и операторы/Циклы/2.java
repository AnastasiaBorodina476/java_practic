public class Main {
    public static void main(String[] args) {
        // Пример с циклом for
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;  // пропускаем итерацию, когда i = 3
            }
            if (i == 8) {
                break;     // выходим из цикла, когда i = 8
            }
            System.out.print(i + " ");
        }
        // Вывод: 1 2 4 5 6 7 
        
        System.out.println("\n---");
        
        // Пример с циклом while
        int j = 0;
        while(j < 10) {
            j++;
            if (j == 2) {
                continue;  // пропускаем j = 2
            }
            if (j == 6) {
                break;     // выходим при j = 6
            }
            System.out.print(j + " ");
        }
        // Вывод: 1 3 4 5
    }
}
