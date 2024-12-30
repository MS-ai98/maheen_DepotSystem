package model;

import java.util.HashMap;
import java.util.Map;

public class ParcelMap {
    private Map<String, Parcel> ParcelMap;

    public ParcelMap() {
        ParcelMap = new HashMap<>();
    }

    public void addParcel(Parcel parcel) {
        ParcelMap.put(parcel.getId(), parcel);
    }

    public Parcel getParcel(String id) {
        return ParcelMap.get(id);
    }

    public Map<String, Parcel> getParcelMap() {
        return ParcelMap;
    }
}