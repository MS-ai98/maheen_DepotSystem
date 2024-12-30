package model;

public class Parcel {
    private String id;
    private String description;
    private double weight;
    private boolean isProcessed;

    private String name; // Customer's name
    private String phoneNumber; // Customer's phone number
    private int length; // Parcel length
    private int width; // Parcel width
    private int height; // Parcel height
    private String status; // Delivery status

    // Constructor to initialize all fields (with customer and parcel details)
    public Parcel(String id, String description, double weight, String name, String phoneNumber, int length, int width, int height, String status) {
        this.id = id;
        this.description = description;
        this.weight = weight;
        this.isProcessed = false;

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.length = length;
        this.width = width;
        this.height = height;
        this.status = status;
    }

    // Overloaded constructor to initialize only id, description, and weight
    public Parcel(String id, String description, double weight) {
        this.id = id;
        this.description = description;
        this.weight = weight;
        this.isProcessed = false;
        this.name = ""; // Default empty string for name
        this.phoneNumber = ""; // Default empty string for phoneNumber
        this.length = 0; // Default value for dimensions
        this.width = 0;  // Default value for dimensions
        this.height = 0; // Default value for dimensions
        this.status = ""; // Default empty string for status
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getDescription() { return description; }
    public double getWeight() { return weight; }
    public boolean isProcessed() { return isProcessed; }
    public void setProcessed(boolean processed) { isProcessed = processed; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // Override toString() for easy debugging or display
    @Override
    public String toString() {
        return "Parcel{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                ", isProcessed=" + isProcessed +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dimensions=" + length + "x" + width + "x" + height +
                ", status='" + status + '\'' +
                '}';
    }
}
