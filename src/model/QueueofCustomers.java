package model;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A queue to manage customer objects.
 */
public class QueueofCustomers {
    private Queue<customer> customerQueue;

    public QueueofCustomers() {
        customerQueue = new LinkedList<>();
    }

    public void addCustomer(customer cust) {
        customerQueue.add(cust);
        Log.getInstance().addLog("Customer queued: " + cust.getFullName() + " (Parcel " + cust.getParcelId() + ")");
    }

    public customer removeCustomer() {
        customer cust = customerQueue.poll();
        if (cust != null) {
            Log.getInstance().addLog("Customer removed from queue: " + cust.getFullName());
        }
        return cust;
    }

    public Queue<customer> getCustomerQueue() {
        return customerQueue;
    }

    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }

    public int size() {
        return customerQueue.size();
    }
    
    public customer peekCustomer() {
        return this.customerQueue.peek();  // Using 'peek' to get the customer at the front of the queue
    }
}
