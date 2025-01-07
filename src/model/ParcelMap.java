package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Stores parcels keyed by parcelId.
 */
public class ParcelMap {
    private Map<String, Parcel> parcelMap;

    public ParcelMap() {
        parcelMap = new HashMap<>();
        loadParcelsFromFile();
    }

    public void addParcel(Parcel parcel) {
        parcelMap.put(parcel.getParcelId(), parcel);
    }

    public Parcel getParcel(String parcelId) {
        return parcelMap.get(parcelId);
    }

    public Map<String, Parcel> getParcelMap() {
        return parcelMap;
    }
    
    public Map<String, Parcel> getAllParcels() {
        return this.parcelMap; // Assuming parcelMap is a field in ParcelMap
    }

    /**
     * Loads parcels from a file.
     */
    private void loadParcelsFromFile() {
        String filePath = "parcels.txt";  // Path to your parcels.txt file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parcelData = line.split(",");
                if (parcelData.length >= 6) {
                    String parcelId = parcelData[0].trim();
                    int daysInDepot = Integer.parseInt(parcelData[1].trim());  // Parse integer for daysInDepot
                    double weight = Double.parseDouble(parcelData[2].trim());  // Parse double for weight
                    int length = Integer.parseInt(parcelData[3].trim());  // Parse integer for length
                    int width = Integer.parseInt(parcelData[4].trim());  // Parse integer for width
                    int height = Integer.parseInt(parcelData[5].trim());  // Parse integer for height
                    // Correctly parse the boolean value for isProcessed
                    boolean isProcessed = parcelData.length > 6 ? Boolean.parseBoolean(parcelData[6].trim()) : false;

                    Parcel parcel = new Parcel(parcelId, daysInDepot, weight, length, width, height, isProcessed);
                    addParcel(parcel);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
