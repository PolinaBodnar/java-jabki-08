package shapes.circle;

import shapes.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Площадь круга: " + area());
    }
}