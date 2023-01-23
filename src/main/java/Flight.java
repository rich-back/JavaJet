import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengerManifest;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.pilotList = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengerManifest = new ArrayList<>();
    }
}
