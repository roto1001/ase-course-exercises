package creational_patterns.example_factory_method.shape_container;

import creational_patterns.example_factory_method.shape_container.shapes.ShapeCubicCurve;
import creational_patterns.example_factory_method.shape_container.shapes.ShapePolygon;
import creational_patterns.example_factory_method.shape_container.shapes.ShapeRectangle;

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
