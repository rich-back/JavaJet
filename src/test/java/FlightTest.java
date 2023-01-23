import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    Plane plane;
    Flight testFlight;


    @Before
    public void before() {
        pilot = new Pilot("Cpt Sully", RankTitle.CAPTAIN, "123");
        plane = new Plane(PlaneType.AIRBUSA380);
        testFlight = new Flight(plane, "JJ5678", "GLA", "EDI", "1200");
    }

    @Test
    public void canReturnAvailableSeats() {
        assertEquals(40, plane.getPlaneCapacity());
    }
}
