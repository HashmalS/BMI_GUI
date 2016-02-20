package com.hashmals.bmigui;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

/**
 * Created by 1 on 20.02.2016.
 * @author HashmalS
 */
public class InputPanel extends JPanel {
    private final String[] labels = {"Height (cm):", "Weight (kg):"};
    private JPanel wPanel, hPanel;
    private NumberFormat format;
    public static JFormattedTextField[] fields = new JFormattedTextField[2];
    
    public InputPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(new Dimension(100, 100));

        wPanel = new JPanel();
        wPanel.setLayout(new FlowLayout());
        setExtraPanel(wPanel, 0);
        hPanel = new JPanel();
        hPanel.setLayout(new FlowLayout());
        setExtraPanel(hPanel, 1);
    }

    private void setExtraPanel(JPanel panel, int i) {
        JLabel label;
        label = new JLabel(labels[i], JLabel.TRAILING);
        panel.add(label);

        format = NumberFormat.getInstance();
        format.setMaximumIntegerDigits(3);
        fields[i] = new JFormattedTextField(format);
        fields[i].setPreferredSize(new Dimension(100, 20));
        label.setLabelFor(fields[i]);
        panel.add(fields[i]);

        this.add(panel);
    }
}
