package com.hashmals.bmigui;

import javax.swing.*;

/**
 * Created on 06.10.2015.
 * @author HashmalS
 */
public class Program {
    public static void main(String[] args) {
        UserFrame userFrame = new UserFrame();
        userFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        userFrame.setSize(250, 200);
        userFrame.setVisible(true);
    }
}
