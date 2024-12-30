package model;

public class customer {
    private String id;
    private String name;
    private String address; // Add the address field

    // Constructor with three parameters
    public customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; } // Add getter for address

    public void setAddress(String address) { this.address = address; } // Optional setter
}
