package lesson1;

/**
 * Created by bakla410 on 16.09.17.
 */
public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
