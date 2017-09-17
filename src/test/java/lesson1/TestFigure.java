package lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bakla410 on 16.09.17.
 */
public class TestFigure {

    @Test
    public void testSquare() {
        Figure figure = new Square(10);
        double area = figure.calculateArea();
        assertEquals(100, area, 0);
    }

    @Test
    public void testRectangle() {
        Figure figure = new Rectangle(10, 15);
        double area = figure.calculateArea();
        assertEquals(150, area, 0);
    }

    @Test
    public void testCircle() {
        Figure figure = new Circle(10);
        double area = figure.calculateArea();
        assertEquals(314, area, 0.9);
    }
}
