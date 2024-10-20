package creational_patterns.example_factory_method.shape_container.imp_containers;

import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.util.List;
import java.util.ArrayList;

// This creational factory method class doesn't use an interface.
// Which makes it harder to add new shape versions like Circle f.e. to the container class.

public class ShapeContainer1 {
    private final List<Shape> shapes = new ArrayList<Shape>();

    public void add(String str) {
        if(str == null) {
            System.out.println("Invalid input, null value provided.");
            return;
        }

        if(str.equalsIgnoreCase("Polygon")) {
            this.shapes.add( new Polygon() );
        }
        else if(str.equalsIgnoreCase("Rectangle")) {
            this.shapes.add( new Rectangle() );
        }
    }

    public void drawAll() {
        for(Shape shape : this.shapes) {
            // shape.draw();
            System.out.println("Drawing shape!");
        }
    }
}


