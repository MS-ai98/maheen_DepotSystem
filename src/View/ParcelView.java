package View;

import model.Parcel;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Displays parcel details in the center panel.
 */
public class ParcelView extends JPanel {
    private JTextArea parcelTextArea;

    public ParcelView() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Parcels"));

        parcelTextArea = new JTextArea(15, 40);
        parcelTextArea.setEditable(false);
        add(new JScrollPane(parcelTextArea), BorderLayout.CENTER);
    }

    /**
     * Displays parcels in the text area.
     */
    public void displayParcels(Map<String, Parcel> parcelMap) {
        parcelTextArea.setText("");  // Clear existing data
        for (Parcel parcel : parcelMap.values()) {
            parcelTextArea.append(parcel.toString() + "\n");
        }
    }
}
