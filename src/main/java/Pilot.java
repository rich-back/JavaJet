public class Pilot {

    private String name;
    private RankTitle rank;
    private String licenceNumber;

    public Pilot(String name, RankTitle rank, String licenceNumber) {
        this.name = name;
        this.rank = RankTitle.CAPTAIN;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return this.name;
    }

    public RankTitle getRank() {
        return this.rank;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }
}
