package model;

/**
 * Parcel class reflecting new data file structure:
 *   parcelId, daysInDepot, weight, length, width, height, isProcessed
 */
public class Parcel {
    private String parcelId;
    private int daysInDepot;
    private double weight;
    private int length;
    private int width;
    private int height;
    private boolean isProcessed;
    private double discount;

    // Constructor with isProcessed
    public Parcel(String parcelId, int daysInDepot, double weight, int length, int width, int height, boolean isProcessed) {
        this.parcelId = parcelId;
        this.daysInDepot = daysInDepot;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isProcessed = isProcessed;
    }

    // Constructor without isProcessed (default to false)
    public Parcel(String parcelId, int daysInDepot, double weight, int length, int width, int height) {
        this(parcelId, daysInDepot, weight, length, width, height, false);
    }

    // Getters/Setters
    public String getParcelId() {
        return parcelId;
    }

    public int getDaysInDepot() {
        return daysInDepot;
    }

    public void setDaysInDepot(int daysInDepot) {
        this.daysInDepot = daysInDepot;
    }

    public double getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Parcel[" +
                "ID=" + parcelId +
                ", DaysInDepot=" + daysInDepot +
                ", Weight=" + weight +
                ", Dim=" + length + "x" + width + "x" + height +
                ", Processed=" + isProcessed +
                "]";
    }
}
