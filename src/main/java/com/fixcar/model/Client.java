package main.java.com.fixcar.model;

import java.util.Objects;

public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private Car car;
    @Override
    public String toString () {
        return "Client {"
                + "\n\tfirstname = " + firstName
                + ", lastname = " + lastName
                + ", email = " + email
                + ",\n\tcar = " + car
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(car, client.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, car);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

