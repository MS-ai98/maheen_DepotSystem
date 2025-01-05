package model;

/**
 * Customer class now has:
 *  - fullName
 *  - queueNumber (the position of the customer in the queue)
 *  - parcelId (the ID of the parcel the customer is waiting for)
 */
public class customer {
    private String fullName;
    private int queueNumber;
    private String parcelId;

    // Static variable to auto-generate the queue number
    private static int nextQueueNumber = 1;

    // Constructor with fullName and parcelId
    public customer(String fullName, String parcelId) {
        this.fullName = fullName;
        this.parcelId = parcelId;
        this.queueNumber = nextQueueNumber++;  // Assign the current nextQueueNumber, then increment it
    }

    // Constructor with fullName, queueNumber, and parcelId (optional)
    public customer(String fullName, int queueNumber, String parcelId) {
        this.fullName = fullName;
        this.queueNumber = queueNumber;
        this.parcelId = parcelId;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public String getParcelId() {
        return parcelId;
    }

    // Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId;
    }

    @Override
    public String toString() {
        return "Customer[Name=" + fullName + 
               ", Queue Number=" + queueNumber + 
               ", Parcel ID=" + parcelId + "]";
    }
}
