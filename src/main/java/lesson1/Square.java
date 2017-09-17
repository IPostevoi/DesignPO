package lesson1;

/**
 * Created by bakla410 on 16.09.17.
 */
public class Square implements Figure {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return Math.pow(width, 2);
    }
}
