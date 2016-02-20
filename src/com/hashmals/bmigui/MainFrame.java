package com.hashmals.bmigui;

import javax.swing.*;

/**
 * Created by 1 on 20.02.2016.
 * @author HashmalS
 */
public class MainFrame extends JFrame {
    private final String[] labels = {"Height (cm):", "Weight (kg):"};
    private JPanel inputPanel, resultPanel;

    public MainFrame() {
        super("BMI Calculator");

        inputPanel = new InputPanel();
        getContentPane().add(inputPanel);

    }
}
