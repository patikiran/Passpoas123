public class Customer {
    public  String name;

    public String phno;
    public String gender;

    public String adress;

    public PassPort passport;

    public Customer(String name, String phno, String gender, String adress, String passport) {
        this.name = name;
        this.phno = phno;
        this.gender = gender;
        this.adress = adress;


    }

    @java.lang.Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phno='" + phno + '\'' +
                ", gender='" + gender + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
