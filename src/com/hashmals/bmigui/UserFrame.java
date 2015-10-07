package com.hashmals.bmigui;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

/**
 * Created on 06.10.2015.
 * @author HashmalS
 */
public class UserFrame extends JFrame {
    private final String[] labels = {"Height (cm):", "Weight (kg):"};
    private NumberFormat format;
    private JFormattedTextField field;
    private JPanel wPanel, hPanel;
    private JButton calculateButton;

    public UserFrame() {
        super("BMI calculator");

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        wPanel = new JPanel();
        wPanel.setLayout(new FlowLayout());
        setPanel(wPanel, 0);
        hPanel = new JPanel();
        hPanel.setLayout(new FlowLayout());
        setPanel(hPanel, 1);

        calculateButton = new JButton("Calculate");
        calculateButton.setEnabled(true);
        getContentPane().add(calculateButton);
    }

    private void setPanel(JPanel panel, int i) {
        JLabel label;
        label = new JLabel(labels[i], JLabel.TRAILING);
        panel.add(label);

        format = NumberFormat.getInstance();
        format.setMaximumIntegerDigits(3);
        field = new JFormattedTextField(format);
        field.setPreferredSize(new Dimension(50, 20));
        label.setLabelFor(field);
        panel.add(field);

        getContentPane().add(panel);
    }
}
