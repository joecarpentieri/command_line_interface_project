import java.util.ArrayList;

//Change to abstract
public class Flight {

    //Properties

    private int time;
    private String destination;
    private int identificationNumber;
    private ArrayList<Passenger> passengers;
//    private ArrayList<String> passengers;


    //Constructor
    public Flight(int inputTime,
                  String inputDestination,
                  int identificationNumber){
        this.time = inputTime;
        this.destination = inputDestination;
        this.identificationNumber = identificationNumber;
        this.passengers = new ArrayList<>();
    }

    //Methods
    //Getters and Setters

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }
    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public ArrayList<Passenger> getPassenger() {
        return passengers;
    }
    public void setPassenger(ArrayList<Passenger> passenger) {
        this.passengers = passenger;
    }

    //Unique methods

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.getPassenger().remove(passenger);
    }

    public String displayAvailableFlights(){
        return this.getDestination();
    }



}  // Last curly bracket
