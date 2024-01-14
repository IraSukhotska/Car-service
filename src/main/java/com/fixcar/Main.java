package main.java.com.fixcar;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String PASSWORD = "default";
    static Scanner SCANNER = new Scanner(System.in);
    static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    static String NAME_PATTERN = "^[a-zA-Z0-9-]{2,}$";

    public static void main(String[] args) {
        run();
    }

    static void run() {
        if (auth()) {
            registerNewClient();
        }
    }

    static boolean auth() {
        boolean accepted = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if (PASSWORD.equals(input)) {
                accepted = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password.");
            }
        }
        System.out.println(accepted ? "Welcome to the Fixcar service!" : "Aplication has been blocked.");
        return accepted;
    }

    static void registerNewClient() {
        System.out.println("Please provide a client details.");
        System.out.print("Email: ");
        String email = SCANNER.nextLine();

        if (!isEmailValid(email)) {
            System.out.println("Provided email is invalid.");
            return;
        }

        System.out.println("First name: ");
        String firstName = SCANNER.nextLine();

        if (!isNameValid(firstName)) {
            System.out.println("Provided first name is invalid.");
            return;
        }

        System.out.println("Last name: ");
        String lastName = SCANNER.nextLine();

        if (!isNameValid(lastName)) {
            System.out.println("Provided last name is invalid.");
            return;
        }
        Client client = buildClient(email, firstName, lastName);
        System.out.println("New client: " + client.firstName + " " + client.lastName + " (" + client.email + ")");
    }

    static Client buildClient(String email, String firstName, String lastName) {
        Client client = new Client();
        client.email = email;
        client.firstName = firstName;
        client.lastName = lastName;
        return client;
    }

    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}