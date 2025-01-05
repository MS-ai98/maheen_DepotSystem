package main;

import controller.manager;

public class main {
    public static void main(String[] args) {
        // Create an instance of the manager class
        manager managerInstance = new manager();
        
        // Load data from files
        managerInstance.loadCustomerData("customers.txt"); // Ensure the file exists with proper format
        managerInstance.loadParcelData("parcels.txt");     // Ensure the file exists with proper format
        
        // Launch the GUI
        managerInstance.launchGUI();
    }
}
