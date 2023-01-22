import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jimbo", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Jimbo", passenger.getName());
    }

    @Test
    public void canGetNumOfBags() {
        assertEquals(2, passenger.getNumOfBags());
    }
}
