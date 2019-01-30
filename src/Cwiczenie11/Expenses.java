package Cwiczenie11;

public class Expenses {
    private String name;
    private double value;

    public Expenses(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValu(double value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Expenses{" +
                "name='" + name + '\'' +
                ", valu=" + value +
                '}';
    }
}
