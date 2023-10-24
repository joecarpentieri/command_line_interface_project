import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @BeforeEach
    void setUp(){
        flight = new Flight(
                "France",
                2000,
                "Paris",
                0);
        passenger = new Passenger("Mike", 44);
    }


    @Test
    void canAddPassenger(){
        flight.addPassenger(passenger);
        assertThat(flight.getPassenger().size()).isEqualTo(1);
    }

} //last curly bracket
