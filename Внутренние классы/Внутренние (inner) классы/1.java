public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        System.out.println("=== Доступ к внутренним классам извне ===");
        
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();
        
        // Outer.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка! Не виден
        
        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();
        
        Outer.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();
    }
}

class Outer {
    private int privateVar = 10;
    public int publicVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;
    
    public class PublicInner {
        public void show() {
            System.out.println("public inner class - доступен везде");
        }
    }
    
    private class PrivateInner {
        public void show() {
            System.out.println("private inner class - доступен только внутри Outer");
        }
    }
    
    protected class ProtectedInner {
        public void show() {
            System.out.println("protected inner class - доступен в том же пакете и подклассах");
        }
    }
    
    class DefaultInner {
        public void show() {
            System.out.println("default inner class - доступен только в том же пакете");
        }
    }
    
    public void testAccess() {
        System.out.println("\n=== Доступ к внутренним классам внутри Outer ===");
        PublicInner pi = new PublicInner();
        pi.show();
        
        PrivateInner pri = new PrivateInner();
        pri.show();
        
        ProtectedInner proi = new ProtectedInner();
        proi.show();
        
        DefaultInner di = new DefaultInner();
        di.show();
    }
}
