import java.util.ArrayList;
import java.util.Scanner;

public class Runner {


    private static ArrayList<Flight> flights = new ArrayList<>();
    private static ArrayList<Passenger> passengers = new ArrayList<>();


    public static void main(String[] args) {

        start();
    }


    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our airline!");
        System.out.println("1. Create a flight");
        System.out.println("2. Display all flights");

        int userInput = scanner.nextInt();
        scanner.nextLine();
        //
        if (userInput == 1) {
            System.out.println("Destination");
            String destination = scanner.nextLine();

            System.out.println("Flight time");
            int time = scanner.nextInt();

            System.out.println("Identification number");
            int identificationNumber = scanner.nextInt();


            Flight newFlight = new Flight(time, destination, identificationNumber);
            flights.add(newFlight);

            start(); //Calls the menu again.
        }
        if (userInput == 2) {
            for (Flight flight : flights) {
                System.out.println("Destination: " + flight.getDestination());

            }
            start();
        }


    }
}//Last curly bracket
