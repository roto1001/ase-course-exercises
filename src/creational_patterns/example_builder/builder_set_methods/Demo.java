package creational_patterns.example_builder.builder_set_methods;

public class Demo {
    public static void main(String[] args) {
        DomainClass myObj = new DomainClass();

        System.out.println(myObj.getNumberString());

        myObj.setA(42);
        myObj.setB(47);
        myObj.setC(11);

        System.out.println(myObj.getNumberString());
    }
}
