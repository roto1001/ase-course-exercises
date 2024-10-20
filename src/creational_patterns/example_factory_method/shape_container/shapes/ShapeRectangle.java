package creational_patterns.example_factory_method.shape_container.shapes;

import creational_patterns.example_factory_method.shape_container.ShapeInterface;

import java.awt.*;

public class ShapeRectangle implements ShapeInterface {
    private Rectangle rectangle;

    public ShapeRectangle() {
        this.rectangle = new Rectangle(); // Initialize AWT Rectangle
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle Shape");
    }
}