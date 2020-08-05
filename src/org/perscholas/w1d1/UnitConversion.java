package org.perscholas.w1d1;

import java.text.DecimalFormat;

public class UnitConversion {

    static double convertInchesToMeters(double inches){
        double meters;
        meters = inches/39.37;
        return meters;

    }
    public static void main(String[] args) {
//        4. Write a Java program that reads a number in inches, converts it to meters.
//Note: One inch is 0.0254 meter. Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters

        double meters = convertInchesToMeters(1000.0);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("1000.0 inches is "+df.format(meters));

    }
}
