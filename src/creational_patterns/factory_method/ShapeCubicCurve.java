package creational_patterns.factory_method;

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