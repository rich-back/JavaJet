import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane airbus;
    Plane boeing;

    @Before
    public void before(){
        airbus = new Plane(PlaneType.AIRBUSA380);
        boeing = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(40, airbus.getPlaneCapacity());
        assertEquals(50, boeing.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneTotalWeight(){
        assertEquals(80, airbus.getPlaneTotalWeight());
        assertEquals(100, boeing.getPlaneTotalWeight());
    }


}
