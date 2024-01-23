package main.java.com.fixcar.model;

import java.util.Objects;

public class Vw extends Car {
    private String size;
    @Override
    public String toString () {
        return "Vw {"
                + "\n\tmark = " + getMark()
                + ", model = " + getModel()
                + ", age = " + getAge()
                + ", color = " + getColor()
                + ", size = " + size
                + ", owner name = " + getOwnerName()
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vw vw = (Vw) o;
        return Objects.equals(size, vw.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
