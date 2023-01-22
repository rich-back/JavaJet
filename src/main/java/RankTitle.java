public enum

RankTitle {

    CAPTAIN("Captain"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String rank;

    RankTitle(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return this.rank;
    }
}
