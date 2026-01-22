package myfirstproject;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private Queue<Customer> orders = new LinkedList<>();

    public void addOrder(Customer c) {
        orders.add(c);
    }

    public void processOrder() {
        if (!orders.isEmpty()) {
            Customer c = orders.poll();
            System.out.println("Processing order for: " + c.getName());
        }
    }
}
