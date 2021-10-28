package com.bl.primenumber;
import java.util.*;


public class PrimeNumberSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int first_Number, last_number, flag;


        System.out.printf("Enter lower bound of the interval: ");
        first_Number = sc.nextInt();

        // Ask user to enter upper value of interval
        System.out.printf("\nEnter upper bound of the interval: ");
        last_number = sc.nextInt();

        // Print display message
        System.out.printf("\nPrime numbers between %d and %d are: ", first_Number,last_number);

        // Traverse each number in the interval
        // with the help of for loop
        for (int i = first_Number; i <= last_number; i++) {


            if (i == 1 || i == 0)
                continue;


            flag = 1;

            for (int    j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}

