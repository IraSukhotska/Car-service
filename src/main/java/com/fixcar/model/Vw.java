package main.java.com.fixcar.model;

import java.util.Objects;

public class Vw extends Car {
    public static final String classA = "Class A";
    public static final String classB = "Class B";
    public static final String classC = "Class C";
    public static final String classD = "Class D";
    public static final String SUV = "SUV";
    public static final String Comerc = "Comercial";
    private String type;
    public Vw() { }
    public Vw(String type) {
        this.type = type;
    }
    @Override
    public String toString () {
        return "Vw {"
                + "\n\tmark = " + getMark()
                + ", model = " + getModel()
                + ", age = " + getAge()
                + ", color = " + getColor()
                + ", type = " + type
                + ", owner name = " + getOwnerName()
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vw vw = (Vw) o;
        return Objects.equals(type, vw.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
