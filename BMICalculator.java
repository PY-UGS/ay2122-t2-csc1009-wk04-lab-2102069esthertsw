package com.esther.lab.wk04;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        BMI bmi = new BMI();
        //Set weight & height values
        System.out.print("Enter weight in pounds: ");
        bmi.setWeightKG(input.nextFloat());
        System.out.print("Enter height in inches: ");
        bmi.setHeightMeter(input.nextFloat());
        //Get BMI value
        double bmiValue = bmi.getBMI();
        System.out.println("BMI is " + bmiValue);

        if (bmiValue < 18.5) {
            System.out.println("Underweight");
        }
        else if (18.5 <= bmiValue && bmiValue < 25) {
            System.out.println("Normal");
        }
        else if (25 <= bmiValue && bmiValue < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
