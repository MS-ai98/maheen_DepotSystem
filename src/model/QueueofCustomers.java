package model;

import java.util.LinkedList;
import java.util.Queue;

public class QueueofCustomers {
    private Queue<customer> customerQueue;

    public QueueofCustomers() {
        customerQueue = new LinkedList<>();
    }

    public void addCustomer(customer customer) {
        customerQueue.add(customer);
    }

    public customer removeCustomer() {
        return customerQueue.poll();
    }

    public Queue<customer> getCustomerQueue() {
        return customerQueue;
    }
}