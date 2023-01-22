public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;

    }

    public int getPlaneCapacity() {
        return planeType.getCapacity();
    }

    public int getPlaneTotalWeight() {
        return planeType.getTotalWeight();
    }


}
