package creational_patterns.factory_method;


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public final class ListFactory {
    // Make constructor of class private to prevent object initialisation and force static use.
    private ListFactory() {}

    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static <T> List<T> newLinkedList() {
        return new LinkedList<T>();
    }
}
