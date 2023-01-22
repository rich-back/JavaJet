import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Cpt Sully", RankTitle.CAPTAIN, "1234");
    }

    @Test
    public void hasName() {
        assertEquals("Cpt Sully", pilot.getName());
    }

    @Test
    public void hasRankCaptain() {
        assertEquals(RankTitle.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("1234", pilot.getLicenceNumber());
    }
}
