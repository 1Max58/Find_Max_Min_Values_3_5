package com.example.findmaxminvalues;

public class FinMaxMinValues {
    public static void main(String[] args) {
        int i = 1;
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxValue = lowerLimit;
        int minValue = upperLimit;
        System.out.println("The program will find the biggest and the smallest numbers from the set of integers.");
        System.out.println("The set of 10 randomly drawn integers from 1 to 100:");
        while (i <= 10)
        {
            int value = (int) (Math.random() * (upperLimit + 1 - lowerLimit) + lowerLimit);
            System.out.println(value);
            if (value > maxValue) {
                maxValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
            i++;
        }
        System.out.println("The biggest number is " + maxValue);
        System.out.println("The smallest number is " + minValue);
    }
}
