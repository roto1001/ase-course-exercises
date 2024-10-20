package creational_patterns.example_builder.builder_with_director.mitarbeiter_builder;

public class MitarbeiterBuilderXML extends MitarbeiterBuilder{
    private int id;
    private String name;

    public MitarbeiterBuilderXML() {
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
                <Mitarbeiter>
                    <id>%d</id>
                    <name>%s</name>
                </Mitarbeiter>""", this.id, this.name);
    }
}
