package controller;

import model.ParcelMap;
import View.ParcelView;

public class ParcelController {
    private ParcelMap parcelMap;
    private ParcelView parcelView;

    public ParcelController(ParcelMap parcelMap, ParcelView parcelView) {
        this.parcelMap = parcelMap;
        this.parcelView = parcelView;
        parcelView.displayParcels(parcelMap.getParcelMap());
    }
}
