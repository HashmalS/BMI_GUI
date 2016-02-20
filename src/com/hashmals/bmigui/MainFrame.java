package com.hashmals.bmigui;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by 1 on 20.02.2016.
 * @author HashmalS
 */
public class MainFrame extends JFrame {
    private final String[] labels = {"Height (cm):", "Weight (kg):"};
    private JPanel inputPanel, resultsPanel;
    private JButton calculateButton;
    Calculator calc;

    public MainFrame() {
        super("BMI Calculator");

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        inputPanel = new InputPanel();
        getContentPane().add(inputPanel).setVisible(true);

        resultsPanel = new ResultsPanel(0);
        getContentPane().add(resultsPanel).setVisible(false);

        calculateButton = new JButton("Calculate");
        calculateButton.setEnabled(true);
        add(calculateButton);
        calculateButton.addActionListener(event -> {
            int height = Integer.parseInt(InputPanel.fields[0].getText());
            int weight = Integer.parseInt(InputPanel.fields[1].getText());
            calc = new Calculator(height, weight);

            DecimalFormat format = new DecimalFormat("#.0");
            ResultsPanel.field.setText(format.format(calc.calculateMetric()));
            resultsPanel.setVisible(true);
        });
    }
}
