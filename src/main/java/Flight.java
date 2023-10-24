import java.util.ArrayList;

//Change to abstract
public class Flight {

    //Properties
    private String name;
    private int time;
    private String destination;
    private int identificationNumber;
    private ArrayList<Passenger> passenger;
//    private ArrayList<String> passengers;


    //Constructor
    public Flight(String inputName,
                  int inputTime,
                  String inputDestination,
                  int identificationNumber){
        this.name = inputName;
        this.time = inputTime;
        this.destination = inputDestination;
        this.identificationNumber = identificationNumber;
        this.passenger = new ArrayList<>();
    }

    //Methods
    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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
        return passenger;
    }
    public void setPassenger(ArrayList<Passenger> passenger) {
        this.passenger = passenger;
    }

    //Unique methods

    public void addPassenger(Passenger passenger){
        this.passenger.add(1, passenger);
    }

    public void removePassenger(Passenger passenger){
        this.getPassenger().remove(0);
    }

}  // Last curly bracket
