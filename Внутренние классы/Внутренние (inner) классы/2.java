public class Main {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.accessOuterFields();
    }
}

class Outer2 {
    private int privateField = 1;
    public int publicField = 2;
    protected int protectedField = 3;
    int defaultField = 4;
    
    class Inner {
        public void accessOuterFields() {
            System.out.println("=== Внутренний класс имеет доступ ко ВСЕМ полям внешнего класса ===");
            System.out.println("privateField: " + privateField);
            System.out.println("publicField: " + publicField);
            System.out.println("protectedField: " + protectedField);
            System.out.println("defaultField: " + defaultField);
            System.out.println("Доступ не зависит от спецификаторов доступа");
        }
    }
}
