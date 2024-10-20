package creational_patterns.example_builder.builder_with_director;

public class MitarbeiterRepresentation {
    private final String representation;

    public MitarbeiterRepresentation(String representation) {
        this.representation = representation;
    }

    public String getMitarbeiter() {
        return this.representation;
    }
}
