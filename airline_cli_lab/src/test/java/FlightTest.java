import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    public void setup(){
        flight = new Flight("Hong Kong");
    }

    @Test
    public void passengerList_start(){
        int actual = flight.countPassengerList();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(new Passenger("John", 12345));
        int actual = flight.countPassengerList();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void canAddMultiplePassenger(){
        flight.addPassenger(new Passenger("John", 12345));
        flight.addPassenger(new Passenger("Bob", 72194));
        int actual = flight.countPassengerList();
        int expected = 2;
        assertEquals(actual, expected);
    }

}
