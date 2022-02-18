import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        customers.add(new Customer(1,"Mehmet","Cebesoy"));
        customers.add(new Customer(2,"Ali","Soy"));
        customers.add(new Customer(2,"Veli","Cebe"));

        customers.remove( new Customer (2,"Ali","Soy"));
// yuKarıda silme işlemi referens numarasına göre tutulduğu için yapmaz
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
