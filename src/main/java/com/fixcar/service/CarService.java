package main.java.com.fixcar.service;
import main.java.com.fixcar.Main;
import main.java.com.fixcar.model.Car;
import main.java.com.fixcar.model.Vw;

public class CarService {
    private static final String CAR_MARK = "Vw";
    public Car registerNewCar(){
        Car car = new Car();

        System.out.print("Mark (Vw / Skoda / Audi / Seat): ");
        String mark = Main.SCANNER.nextLine();
        car.setMark(mark);

        if (CAR_MARK.equals(mark)) {
            car = buildVw();
        } else {
            car = buildCar(mark);
        }
        return car;
    }

    private Vw buildVw() {
        Car car = buildCar(CAR_MARK);
        Vw vw = carToVw(car);

        System.out.print("Type (Privet / Commercial): ");
        vw.setSize(Main.SCANNER.nextLine());

        return vw;
    }

    private Vw carToVw(Car car) {
        Vw vw = new Vw();
        vw.setMark(car.getMark());
        vw.setModel(car.getModel());
        vw.setAge(car.getAge());
        vw.setColor(car.getColor());

        return vw;
    }

    private Car buildCar(String mark) {
        Car car = new Car();
        car.setMark(mark);

        System.out.print("Model: ");
        car.setModel(Main.SCANNER.nextLine());

        System.out.print("Age: ");
        car.setAge(Main.SCANNER.nextLine());

        System.out.print("Color (Black / White): ");
        car.setAge(Main.SCANNER.nextLine());

        return car;
    }
}
