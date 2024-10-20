package creational_patterns.example_factory_method.shape_container.imp_containers;

import creational_patterns.example_factory_method.shape_container.ShapeInterface;

import java.util.List;
import java.util.ArrayList;

// The ShapeContainer2 doesn't need to be changed if more shapes are added,
// because it uses the shape interface.

public class ShapeContainer2 {
    private final List<ShapeInterface> shapes = new ArrayList<ShapeInterface>();

    public void add(String str) {
        // ShapeInterface.createShape(str)
        //        .ifPresent( shape -> this.shapes.add(shape));

        // This does the same in a shorter way
        ShapeInterface.createShape(str)
                .ifPresent(this.shapes::add);
    }

    public void drawAll() {
        for(ShapeInterface i : this.shapes) {
            i.draw();
        }
    }
}
