package main.java.com.fixcar.component;

import main.java.com.fixcar.Main;
import main.java.com.fixcar.model.Car;
import main.java.com.fixcar.model.Client;
import main.java.com.fixcar.service.CarService;
import main.java.com.fixcar.service.ClientService;

public class ApplicationRunner {
    private final ClientService clientService = new ClientService();
    private final CarService carService = new CarService();
    public void run() {
        if (Authenticator.auth()) {
            Client client = clientService.registerNewClient();
            if (client == null) {
                return;
            }

            System.out.println("Do you want to register new car? (Y/N)");
            String isNewCar = Main.SCANNER.nextLine();
            if (isNewCar.equals("N")) {
                return;
            }

            System.out.println("Adding a new car.");
            Car car = carService.registerNewCar();

            if (car != null) {
                client.setCar(car);
                car.setOwnerName(client.getFirstName() + " " + client.getLastName());
                System.out.println("Car has been added.");

                System.out.println(client);
            }
        }
    }
}
