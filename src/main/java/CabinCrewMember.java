public class CabinCrewMember {

    private String name;
    private RankTitle rank;

    public CabinCrewMember(String name, RankTitle rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public RankTitle getRank() {
        return this.rank;
    }
}
