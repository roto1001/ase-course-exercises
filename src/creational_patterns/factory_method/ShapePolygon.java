package creational_patterns.factory_method;

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