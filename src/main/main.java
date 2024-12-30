package main;

import javax.swing.*;
import model.Parcel;
import model.ParcelMap;
import View.ParcelView;
import controller.ParcelController;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ParcelMap parcelMap = new ParcelMap();
                loadParcelData(parcelMap);

                ParcelView parcelView = new ParcelView();
                new ParcelController(parcelMap, parcelView);

                parcelView.setVisible(true);
            }
        });
    }

    private static void loadParcelData(ParcelMap parcelMap) {
        try (BufferedReader br = new BufferedReader(new FileReader("parcels.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Remove leading and trailing spaces and split data
                String[] data = line.trim().split(",");

                // Extract data from the parsed array, accounting for all fields
                String name = data[0].trim();
                String phoneNumber = data[1].trim();
                String id = data[2].trim();
                double weight = Double.parseDouble(data[3].trim());
                int length = Integer.parseInt(data[4].trim());
                int width = Integer.parseInt(data[5].trim());
                int height = Integer.parseInt(data[6].trim());
                String status = data[7].trim();

                // Create a new Parcel with all fields and add it to the ParcelMap
                Parcel parcel = new Parcel(id, "Parcel for " + name, weight, name, phoneNumber, length, width, height, status);
                parcelMap.addParcel(parcel);
            }
        } catch (IOException e) {
            System.err.println("Error reading the parcels.txt file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing a number. Please check the format of parcels.txt.");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: A line in parcels.txt does not have the correct number of fields.");
            e.printStackTrace();
        }
    }
}
