//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class AirportTest {
//
//    Airport airport;
//    Flight flights;
//    @BeforeEach
//    public void setUp(){
//        flights = new Flight("France Flight", 2000, "France", 100);
//        airport = new Airport();
//    }
//
//    @Test
//    void canAddDestination(){
//        airport.addDestination(flights);
//        assertThat(airport.countFlight()).isEqualTo(1);
//    }
//
//    @Test
//    void canRemoveDestination(){
//        airport.removeDestination(flights);
//        assertThat(airport.countFlight()).isEqualTo(0);
//    }
//
////    @Test
////    void checkTicketsForFlight(){
////        airport.setDestination(flights);
////        assertThat(airport.getDestination()).isEqualTo(flights);
////
////    }
//
//    @Test
//    void canSellTickets(){
//
//    }
//
//}
