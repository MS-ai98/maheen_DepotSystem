package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class manager {
    private QueueofCustomers queueofCustomers;
    private ParcelMap parcelMap;
    private Worker worker;

    // Constructor
    public manager() {
        queueofCustomers = new QueueofCustomers();
        parcelMap = new ParcelMap();
        worker = new Worker();
    }

    // Method to load customer data from file
    public void loadCustomerData() {
        try (BufferedReader br = new BufferedReader(new FileReader("customers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                String address = data[1].trim();
                String id = data[2].trim();
                queueofCustomers.addCustomer(new customer(name, address, id));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load parcel data from file
    public void loadParcelData() {
        try (BufferedReader br = new BufferedReader(new FileReader("parcels.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String parcelId = data[0].trim();
                String description = data[1].trim();
                double weight = Double.parseDouble(data[2].trim());
                parcelMap.addParcel(new Parcel(parcelId, description, weight));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing a double value. Please check the format of parcels.txt.");
            e.printStackTrace();
        }
    }

    // Method to start processing customers and their parcels
    public void startProcessing() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            while (!queueofCustomers.getCustomerQueue().isEmpty()) {
                customer customer = queueofCustomers.removeCustomer();
                System.out.println("Processing customer: " + customer.getName());
                System.out.print("Enter parcel ID to process: ");
                String parcelId = scanner.nextLine();
                worker.processCustomer(customer, parcelMap, parcelId);
            }
        } finally {
            if (scanner != null) {
                scanner.close(); // Make sure to close the scanner
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        manager manager = new manager();
        manager.loadCustomerData();
        manager.loadParcelData();
        manager.startProcessing();
        System.out.println(Log.getInstance().getLog());
    }
}
