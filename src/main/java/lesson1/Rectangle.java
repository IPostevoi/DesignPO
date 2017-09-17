package lesson1;

/**
 * Created by bakla410 on 16.09.17.
 */
public class Rectangle implements Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
