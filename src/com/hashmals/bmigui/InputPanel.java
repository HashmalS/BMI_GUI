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
    private JButton calculateButton;
    private NumberFormat format;
    private JFormattedTextField field;
    
    public InputPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        wPanel = new JPanel();
        wPanel.setLayout(new FlowLayout());
        setPanel(wPanel, 0);
        hPanel = new JPanel();
        hPanel.setLayout(new FlowLayout());
        setPanel(hPanel, 1);

        calculateButton = new JButton("Calculate");
        calculateButton.setEnabled(true);
        add(calculateButton);
    }

    private void setPanel(JPanel panel, int i) {
        JLabel label;
        label = new JLabel(labels[i], JLabel.TRAILING);
        panel.add(label);

        format = NumberFormat.getInstance();
        format.setMaximumIntegerDigits(3);
        field = new JFormattedTextField(format);
        field.setPreferredSize(new Dimension(100, 20));
        label.setLabelFor(field);
        panel.add(field);

        this.add(panel);
    }
}
