package ChapterThree;

import java.util.Scanner;

public class HeartRatesMain {
    public static void main(String[] args) {
        System.out.println("Client Profile");
        HeartRates heartRates = new HeartRates("Chris","Rich",30,12,1982);
        System.out.println("First Name: " + heartRates.getFirstName());
        System.out.println("Last Name: " + heartRates.getLastName());
        System.out.println("Date of birth: " + heartRates.getDay()+ ":" + heartRates.getMonth() + ":" + heartRates.getYearOfBirth());
        System.out.println("Age in years is: " + heartRates.ageInYears());
        System.out.println("The maximum heart rate is: " + heartRates.maximumHeartRate());
        System.out.println("Enter intensity  from 50 - 85 to calculate THR: ");
        Scanner scanner = new Scanner(System.in);
        int intensity = scanner.nextInt();
        System.out.println("The target heart rate (percent) is: " + heartRates.targetHeartRatePercentage(intensity));



    }
}
