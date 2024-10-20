package creational_patterns.example_builder.builder_with_director;

public class Mitarbeiter {
    private final int id;
    private final String name;

    public Mitarbeiter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
