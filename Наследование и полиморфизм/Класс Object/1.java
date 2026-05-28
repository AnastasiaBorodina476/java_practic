public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Иван", "Иванов", 25);
        Person p2 = new Person("Иван", "Иванов", 25);
        Person p3 = new Person("Петр", "Петров", 30);
        
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.equals(null): " + p1.equals(null));
        System.out.println("p1.equals(p1): " + p1.equals(p1));
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        Person other = (Person) obj;
        
        if (age != other.age) return false;
        if (firstName == null) {
            if (other.firstName != null) return false;
        } else if (!firstName.equals(other.firstName)) return false;
        if (lastName == null) {
            if (other.lastName != null) return false;
        } else if (!lastName.equals(other.lastName)) return false;
        
        return true;
    }
}
