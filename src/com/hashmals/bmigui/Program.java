package com.hashmals.bmigui;

import javax.swing.*;

/**
 * Created on 06.10.2015.
 * @author HashmalS
 */
public class Program {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(250, 200);
        mainFrame.setVisible(true);
    }
}
