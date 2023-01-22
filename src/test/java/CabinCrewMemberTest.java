import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember captain;
    CabinCrewMember attendant;

    @Before
    public void before() {
        captain = new CabinCrewMember("Cpt Sully", RankTitle.CAPTAIN);
        attendant = new CabinCrewMember("Billy", RankTitle.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Cpt Sully", captain.getName());
        assertEquals("Billy", attendant.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankTitle.CAPTAIN, captain.getRank());
        assertEquals(RankTitle.FLIGHT_ATTENDANT, attendant.getRank());
    }

}
