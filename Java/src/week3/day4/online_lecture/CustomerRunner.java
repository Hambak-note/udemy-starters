package week3.day4.online_lecture;

public class CustomerRunner {

    public static void main(String[] args) {

        Address homeAddress = new Address("line 1", "Hyderabad", "500035");
        Customer customer = new Customer("Ranga", homeAddress);


        Address workAddress = new Address("line2", "florida", "12345463");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);


    }
}
