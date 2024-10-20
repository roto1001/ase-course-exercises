package creational_patterns.example_factory_method.shape_container.shapes;

import creational_patterns.example_factory_method.shape_container.ShapeInterface;

import java.awt.geom.CubicCurve2D;

public class ShapeCubicCurve implements ShapeInterface {
    private CubicCurve2D cubicCurve;

    public ShapeCubicCurve() {
        this.cubicCurve = new CubicCurve2D.Double(); // Initialize AWT CubicCurve2D
    }

    @Override
    public void draw() {
        System.out.println("Drawing CubicCurve Shape");
    }
}