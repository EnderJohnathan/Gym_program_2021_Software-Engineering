import java.util.ArrayList;
import java.util.List;

// A class to save all customers' information
public class CustomerList {
    public static List<Customer> customers = new ArrayList<Customer>();

    public static void begin() {
        customers.add(new Customer("123", "123"));// initial username and password.

        //code to add gender, age, weight, height informaiton
    }
}
