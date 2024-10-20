package creational_patterns.example_factory_method.shape_container.shapes;

import creational_patterns.example_factory_method.shape_container.ShapeInterface;

import java.awt.*;

public class ShapePolygon implements ShapeInterface {
    private Polygon polygon;

    public ShapePolygon() {
        this.polygon = new Polygon(); // Initialize AWT Polygon
    }

    @Override
    public void draw() {
        // Implement the draw method using AWT Polygon functionality
        System.out.println("Drawing Polygon Shape");
    }
}