public class Main {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x = 5;
        System.out.println("\nx++ = " + (x++) + ", после x = " + x);
        x = 5;
        System.out.println("++x = " + (++x) + ", после x = " + x);
        
        System.out.println("\na == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        
        boolean t = true, f = false;
        System.out.println("\nt && f: " + (t && f));
        System.out.println("t || f: " + (t || f));
        System.out.println("!t: " + (!t));
        
        int c = 5, d = 3;
        System.out.println("\nc & d: " + (c & d));
        System.out.println("c | d: " + (c | d));
        System.out.println("c ^ d: " + (c ^ d));
        System.out.println("c >> 1: " + (c >> 1));
        System.out.println("c << 1: " + (c << 1));
        
        int max = (a > b) ? a : b;
        System.out.println("\nmax: " + max);
        
        int val = 10;
        val += 5;
        System.out.println("val += 5: " + val);
        val -= 3;
        System.out.println("val -= 3: " + val);
        val *= 2;
        System.out.println("val *= 2: " + val);
        
        System.out.println("\nHello + World = " + ("Hello" + " World"));
        System.out.println("Число: " + 42);
    }
}
