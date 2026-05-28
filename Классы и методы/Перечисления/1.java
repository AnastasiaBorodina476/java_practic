public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet + ": масса = " + planet.getMass() + ", радиус = " + planet.getRadius());
        }
    }
}

enum Planet {
    MERCURY(3.30e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    EARTH(5.98e24, 6.38e6),
    MARS(6.42e23, 3.40e6),
    JUPITER(1.90e27, 7.15e7),
    SATURN(5.68e26, 6.03e7),
    URANUS(8.68e25, 2.56e7),
    NEPTUNE(1.02e26, 2.48e7);
    
    private final double mass;
    private final double radius;
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() {
        return mass;
    }
    
    public double getRadius() {
        return radius;
    }
}
