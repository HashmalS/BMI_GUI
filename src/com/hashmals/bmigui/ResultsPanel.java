package com.hashmals.bmigui;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

/**
 * Created by 1 on 20.02.2016.
 * @author HashmalS
 */
public class ResultsPanel extends JPanel {
    private NumberFormat format;
    public static JTextField field;

    public ResultsPanel(int output) {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(100, 200));

        JLabel label = new JLabel("Your BMI");
        add(label);

        field = new JTextField();
        label.setLabelFor(field);
        add(field);
    }
}
