public class Main {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.accessInnerFields();
    }
}

class Outer3 {
    
    class Inner {
        private int privateInner = 100;
        public int publicInner = 200;
        protected int protectedInner = 300;
        int defaultInner = 400;
    }
    
    public void accessInnerFields() {
        Inner inner = new Inner();
        
        System.out.println("=== Внешний класс имеет доступ ко ВСЕМ полям внутреннего класса ===");
        System.out.println("privateInner: " + inner.privateInner);
        System.out.println("publicInner: " + inner.publicInner);
        System.out.println("protectedInner: " + inner.protectedInner);
        System.out.println("defaultInner: " + inner.defaultInner);
        System.out.println("Доступ не зависит от спецификаторов доступа");
    }
}
