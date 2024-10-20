package creational_patterns.example_builder.builder_with_director.mitarbeiter_builder;

public class MitarbeiterBuilderJson extends MitarbeiterBuilder{
    private int id;
    private String name;

    public MitarbeiterBuilderJson() {
        super();
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String build() {
        return String.format("""
                {
                    "id": %d,
                    "Name": %s
                }""", this.id, this.name);
    }
}
