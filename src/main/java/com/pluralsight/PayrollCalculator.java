package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // Exercise 5: Payroll Calculator
        // create a java application that prompts the user for their
        //   - name
        //   - hours worked (float)
        //   - pay rate (float)
        // calculate their gross pay

        // Declare and initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare, read, initialize employee variables
        System.out.print("Enter your name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter the number of hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter your rate of pay: ");
        float payRate = scanner.nextFloat();

        // Calculate gross pay
        float grossPay = hoursWorked * payRate;

        // Display results
        System.out.println("Payroll record for " + employeeName);
        System.out.println("Gross pay: %.2f" + grossPay);

    }
}
