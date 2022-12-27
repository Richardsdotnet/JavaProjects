package ChapterFour.ChristmasSnacks;

import java.util.Scanner;

public class EmployeesSalaryCalculator {
    int hourlyRate;
    int workingHours;
    double grossPay;
    Scanner input = new Scanner(System.in);
    //private double grossPayForNormalTime;

    public void grossPay(){
        System.out.println("Enter hours worked");
        workingHours = input.nextInt();
        System.out.println("Enter hourly Rate");
        hourlyRate = input.nextInt();
        if(workingHours <= 40){
            grossPay =(double) workingHours * hourlyRate;}
        else {
            grossPay = (40 * hourlyRate) + ((workingHours - 40) * 1.5) * (hourlyRate);
        }

        System.out.printf("The employees Gross pay is: %f%n", grossPay);
    }
}
