package ChapterThree;

import java.time.LocalDate;

public class HealthProfileMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1989,10,6);

        HealthProfile healthProfile = new HealthProfile("Chris", "Rich",
                "Male", localDate, 25, 50);
        healthProfile.setFirstName("Chiboy");
        healthProfile.getFirstName();
        healthProfile.age();
        healthProfile.maximumHeartRate();
        healthProfile.targetHeartRateRange(70);


    }
}
