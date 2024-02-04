package main.java.com.fixcar.model;

import java.util.Objects;

public class Vw extends Car {
    private String type;
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
