public class PassPort {

    public String name;

    public String phon;

    public String dateofBrith;

    public String country;

    public String dateofIssue;

    public String dateofExpire;

    public PassPort(String name, String phon, String dateofBrith, String country, String dateofIssue, String dateofExpire) {
        this.name = name;
        this.phon = phon;
        this.dateofBrith = dateofBrith;
        this.country = country;
        this.dateofIssue = dateofIssue;
        this.dateofExpire = dateofExpire;
    }

    @java.lang.Override
    public String toString() {
        return "passport{" +
                "name='" + name + '\'' +
                ", phon='" + phon + '\'' +
                ", dateofBrith='" + dateofBrith + '\'' +
                ", country='" + country + '\'' +
                ", dateofIssue='" + dateofIssue + '\'' +
                ", dateofExpire='" + dateofExpire + '\'' +
                '}';
    }
}