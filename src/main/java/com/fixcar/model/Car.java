package main.java.com.fixcar.model;

import java.util.Objects;

public abstract class Car {
    private String mark;
    private String model;
    private String age;
    private String color;
    private String ownerName;

    @Override
    public String toString() {
        return "Car {"
                + "\n\tmark = " + mark
                + " model = " + model
                + ", age = " + age
                + ", color = " + color
                + ",\n\townerName = " + ownerName
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(mark, car.mark)
                && Objects.equals(model, car.model)
                && Objects.equals(age, car.age)
                && Objects.equals(color, car.color)
                && Objects.equals(ownerName, car.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, age, color, ownerName);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
