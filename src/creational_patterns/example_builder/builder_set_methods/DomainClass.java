package creational_patterns.example_builder.builder_set_methods;

public class DomainClass {
    private int a = 1;
    private int b = 2;
    private int c = 3;

    public DomainClass() {}

    public void setA(int num) {
        this.a = num;
    }

    public void setB(int num) {
        this.b = num;
    }

    public void setC(int num) {
        this.c = num;
    }

    public String getNumberString() {
        return  String.format("""
                a: %d, b: %d, c: %d""", this.a, this.b, this.c);
    }
}
