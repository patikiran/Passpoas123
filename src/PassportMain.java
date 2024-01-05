



public class PassportMain {

    public static void main(String[]args){

        Emigration emigration=new Emigration();

        PassPort passPort = new PassPort("Kiran Naidu","12345678","12/02/2024","India","13/08/2021","23/09/2027");

        Customer customer=new Customer("kirannaidu","54757","male","vij", passPort.toString());

        System.out.println(emigration.booking(customer));
    }
