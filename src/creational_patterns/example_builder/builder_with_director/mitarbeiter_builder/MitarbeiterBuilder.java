package creational_patterns.example_builder.builder_with_director.mitarbeiter_builder;

public abstract class MitarbeiterBuilder {
    protected MitarbeiterBuilder(){};

    public abstract void setId(int id);
    public abstract void setName(String name);
    public abstract String build();
}
