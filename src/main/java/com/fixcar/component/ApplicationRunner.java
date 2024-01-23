package main.java.com.fixcar.component;

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

            if (client != null) {
                System.out.println("Adding a new car.");
                Car car = carService.registerNewCar();
                client.setCar(car);
                car.setOwnerName(client.getFirstName() + " " + client.getLastName());
                System.out.println("Car has been added.");

                System.out.println(client);
            }
        }
    }
}
