public class Ticket {
    public String FightNo;

    public String seatNo;

    public String BoadingTime;

    public String geteNo;

    public String from;

    public String to;

    public Ticket(String fightNo, String seatNo, String boadingTime, String geteNo, String from, String to) {
        FightNo = fightNo;
        this.seatNo = seatNo;
        BoadingTime = boadingTime;
        this.geteNo = geteNo;
        this.from = from;
        this.to = to;
    }

    @java.lang.Override
    public String toString() {
        return "Ticket{" +
                "FightNo='" + FightNo + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", BoadingTime='" + BoadingTime + '\'' +
                ", geteNo='" + geteNo + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
