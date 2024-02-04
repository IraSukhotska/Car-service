package main.java.com.fixcar.service;
import main.java.com.fixcar.Main;
import main.java.com.fixcar.model.Car;
import main.java.com.fixcar.model.Skoda;
import main.java.com.fixcar.model.Vw;

public class CarService {
    private static final String VW_TYPE = "Vw";
    private static final String SKODA_TYPE = "Skoda";
    public Car registerNewCar(){
        Car car = null;

        System.out.print("Mark (Vw / Skoda): ");
        String mark = Main.SCANNER.nextLine();


        if (VW_TYPE.equals(mark) || SKODA_TYPE.equals(mark)) {
            car = buildCar(mark);
        } else {
            System.out.println("Unknown car mark: " + mark);
        }
        return car;
    }


    private Car buildCar(String mark) {
        Car car = mark.equals(SKODA_TYPE) ? new Skoda() : new Vw();
        car.setMark(mark);

        System.out.print("Model: ");
        car.setModel(Main.SCANNER.nextLine());

        System.out.print("Age: ");
        car.setAge(Main.SCANNER.nextLine());

        System.out.print("Color (Black / White): ");
        car.setColor(Main.SCANNER.nextLine());

        if (mark.equals(VW_TYPE)) {
            System.out.println("Type (Privet / Commercial): ");
            ((Vw) car).setType(Main.SCANNER.nextLine() );
        }
        return car;
    }
}
