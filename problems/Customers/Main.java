package January2025.Customers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Hachi", 6);
        Customer customer2 = new Customer("Archi", 4);
        Customer customer3 = new Customer("Balcho", 11);
        Customer customer4 = new Customer("Brian", 2);

        Customer[] customers = {customer, customer2, customer3, customer4};

        List<Customer> customerList = sortCustomersByAge(customers);

        for (Customer c : customerList) {
            System.out.println(c.toString());
        }

     }

     public static List<Customer> sortCustomersByAge(Customer[] customers) {

        return Arrays.stream(customers).
                sorted(Comparator.comparingInt(Customer::getAge)).
                limit(3).
                collect(Collectors.toList());
     }
}
