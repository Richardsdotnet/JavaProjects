package ChapterThree;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfileMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1995,04,25);

        HealthProfile healthProfile = new HealthProfile("Chris", "Rich",
                "Male", localDate, 25, 50);
//        System.out.println("Enter First Name");
//        Scanner input = new Scanner(System.in);

        healthProfile.setFirstName("Chriiis");
        healthProfile.getFirstName();
        healthProfile.getLastName();
        healthProfile.getHeight_In_Inches();
        healthProfile.age();
        healthProfile.maximumHeartRate();
        healthProfile.targetHeartRateRange(70);


    }
}
