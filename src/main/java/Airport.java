import java.util.ArrayList;

public class Airport {
    //Rayster is here

    private Passenger passenger;
    private ArrayList<Flights> availableFlights;

    public Airport(){
        this.availableFlights = new ArrayList<>();
    }

    public int countFlight() {
        return availableFlights.size();
    }

    public void addDestination(Flights flights) {
        this.availableFlights.add(flights);
    }

    public void removeDestination(Flights flights) {
        this.availableFlights.remove(flights);
    }

//    methods

//    public

}
