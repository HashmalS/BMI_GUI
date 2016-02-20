package com.hashmals.bmigui;

/**
 * Created on 06.10.2015.
 * @author HashmalS
 */
public class Calculator {
    private int height;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Calculator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateMetric() {
        return ((double)weight / Math.pow(((double)height / 100), 2));
    }

    public double calculateImperial() {
        return ((double)weight / Math.pow(((double)height / 100), 2)) * 703;
    }
}
