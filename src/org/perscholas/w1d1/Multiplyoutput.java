package org.perscholas.w1d1;
import java.util.Scanner;


public class Multiplyoutput {
        public static void main(String[] args)
        {
            System.out.println("Let's multiply!!!\nEnter the first number:");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            System.out.println("Enter the second number:");
            int b = in.nextInt();
            int product = a*b;
            System.out.println(a+" + "+b+" = "+product);
        }
    }

