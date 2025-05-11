package shapes.main;

import shapes.Shape;
import shapes.circle.Circle;
import shapes.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Circle(3.0),
                new Rectangle(2.0, 3.0)
        };

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
