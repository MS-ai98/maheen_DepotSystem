package View;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import model.Parcel;

public class ParcelView extends JFrame {
    private JTextArea parcelTextArea;

    public ParcelView() {
        setTitle("Parcel Processing System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parcelTextArea = new JTextArea();
        add(new JScrollPane(parcelTextArea), BorderLayout.CENTER);
    }

    public void displayParcels(Map<String, Parcel> parcels) {
        parcelTextArea.setText("");
        for (Parcel parcel : parcels.values()) {
            parcelTextArea.append("ID: " + parcel.getId() + ", Description: " + parcel.getDescription() + ", Weight: " + parcel.getWeight() + "\n");
        }
    }
}