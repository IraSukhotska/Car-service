package main.java.com.fixcar.service;

import main.java.com.fixcar.Main;
import main.java.com.fixcar.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String NAME_PATTERN = "^[a-zA-Z0-9-]{2,}$";
    public Client registerNewClient() {
        Client client = null;
        System.out.println("Please provide a client details.");
        System.out.print("Email: ");
        String email = Main.SCANNER.nextLine();

        if (!isEmailValid(email)) {
            System.out.println("Provided email is invalid.");
            return client;
        }

        System.out.println("First name: ");
        String firstName = Main.SCANNER.nextLine();

        if (!isNameValid(firstName)) {
            System.out.println("Provided first name is invalid.");
            return client;
        }

        System.out.println("Last name: ");
        String lastName = Main.SCANNER.nextLine();

        if (!isNameValid(lastName)) {
            System.out.println("Provided last name is invalid.");
            return client;
        }
        client = buildClient(email, firstName, lastName);
        System.out.println("New client: " + client.getFirstName() + " "
                + client.getLastName() + " ("
                + client.getEmail() + ")");
        return client;
    }
    private static Client buildClient(String email, String firstName, String lastName) {
        Client client = new Client();
        client.setEmail(email);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        return client;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
