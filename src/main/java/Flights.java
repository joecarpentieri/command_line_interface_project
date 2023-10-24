import java.util.ArrayList;
//Comment part two to check
//Change to abstract
public class Flights {

    //Properties
    private String name;
    private int time;
    private String destination;
    private int distanceFromUK;
//    private ArrayList<String> passengers;


    //Constructor
    public Flights(String inputName,
                   int inputTime,
                   String inputDestination,
                   int inputDistanceFromUK){
        this.name = inputName;
        this.time = inputTime;
        this.destination = inputDestination;
        this.distanceFromUK = inputDistanceFromUK;
    }

    //Methods
    //Display the flights available
    //Should display destination (String)
    //
    public void addDestination(){
        this.destination
    }



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

    public int getDistanceFromUK() {
        return distanceFromUK;
    }
    public void setDistanceFromUK(int distanceFromUK) {
        this.distanceFromUK = distanceFromUK;
    }
}  // Last curly bracket
