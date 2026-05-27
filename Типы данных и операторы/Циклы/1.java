public class Main {
    public static void main(String[] args) {
        // Бесконечный цикл while
        int i = 0;
        while(true) {
            System.out.println("Бесконечный цикл while, итерация: " + i);
            i++;
            if (i >= 5) break;
        }
        
        // Бесконечный цикл do-while
        int j = 0;
        do {
            System.out.println("Бесконечный цикл do-while, итерация: " + j);
            j++;
            if (j >= 5) break;
        } while(true);
    }
}
