package myfirstproject;

import java.util.LinkedList;

public class CustomerList {
    private LinkedList<Customer> customers = new LinkedList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void displayCustomers() {
        for (Customer c : customers) {
            c.displayInfo();
        }
    }
}

