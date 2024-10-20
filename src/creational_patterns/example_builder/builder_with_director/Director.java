package creational_patterns.example_builder.builder_with_director;

import creational_patterns.example_builder.builder_with_director.mitarbeiter_builder.MitarbeiterBuilder;

public class Director {
    public Director() {}

    public MitarbeiterRepresentation construct(MitarbeiterBuilder builder, Mitarbeiter mitarbeiter) {
        builder.setName(mitarbeiter.getName());
        builder.setId(mitarbeiter.getId());
        return new MitarbeiterRepresentation(builder.build());
    }
}
