package shapes.main;

import shapes.Shape;
import shapes.circle.Circle;
import shapes.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6),
                new Circle(3),
                new Rectangle(2, 3)
        };

        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
