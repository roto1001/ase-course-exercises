package creational_patterns.example_builder.builder_with_director;

import creational_patterns.example_builder.builder_with_director.mitarbeiter_builder.MitarbeiterBuilder;
import creational_patterns.example_builder.builder_with_director.mitarbeiter_builder.MitarbeiterBuilderJson;
import creational_patterns.example_builder.builder_with_director.mitarbeiter_builder.MitarbeiterBuilderXML;
;

public class Demo {
    public static void main(String[] args) {
        Mitarbeiter karin = new Mitarbeiter(1, "Karin");

        Director director = new Director();

        MitarbeiterBuilder builderXML = new MitarbeiterBuilderXML();
        MitarbeiterBuilder builderJSON = new MitarbeiterBuilderJson();

        MitarbeiterRepresentation xmlRepKarin =
                director.construct(builderXML, karin);
        System.out.println("Karin: " + xmlRepKarin.getMitarbeiter());

        MitarbeiterRepresentation jsonRepKarin =
                director.construct(builderJSON, karin);
        System.out.println("Karin: " + jsonRepKarin.getMitarbeiter());
    }
}
