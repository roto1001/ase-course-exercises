package creational_patterns.factory_method;

import java.util.Optional;

public interface ShapeInterface {
    public void draw();

    static Optional<ShapeInterface> createShape(String str) {
        if (str.equalsIgnoreCase("Polygon")) {
            return Optional.of(new ShapePolygon());
        } else if (str.equalsIgnoreCase("Rectangle")) {
            return Optional.of(new ShapeRectangle());
        } else if (str.equalsIgnoreCase("CubicCurve")) {
            return Optional.of(new ShapeCubicCurve());
        } else {
            return Optional.empty();
        }
    }
}
