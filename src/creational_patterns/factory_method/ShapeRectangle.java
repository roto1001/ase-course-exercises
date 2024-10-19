package creational_patterns.factory_method;

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