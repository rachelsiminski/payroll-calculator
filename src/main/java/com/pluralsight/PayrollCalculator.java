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

        // Bonus: Calculate overtime
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            float overtimeRate = payRate * 1.5f;
            float overtimePay = overtimeHours * overtimeRate;
            grossPay = payRate * 40;
            float grossAndOvertimePay = grossPay + overtimePay;

            System.out.printf("Overtime pay: $%.2f", grossAndOvertimePay);

        }
        else {
            System.out.printf("Gross pay: $%.2f", grossPay);
        }

    }
}
