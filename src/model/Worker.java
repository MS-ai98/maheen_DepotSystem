package model;

public class Worker {
    public double calculateFee(Parcel parcel) {
        // Example fee calculation based on weight
        return parcel.getWeight() * 2.5;
    }

    public void processCustomer(customer customer, ParcelMap parcelMap, String parcelId) {
        Parcel parcel = parcelMap.getParcel(parcelId);
        if (parcel != null && !parcel.isProcessed()) {
            double fee = calculateFee(parcel);
            parcel.setProcessed(true);
            Log.getInstance().addLog("Processed parcel " + parcelId + " for customer " + customer.getId() + ". Fee: " + fee);
        }
    }
}
