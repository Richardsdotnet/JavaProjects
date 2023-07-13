package ChapterThree;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private final LocalDate dateOfBirth;
    private int height_In_Inches;
    private int weight_in_Pounds;
    private int maximumHeartRate;
    private int targetHeartRate;
    private int age;


    LocalDate localDate = LocalDate.now();

    public HealthProfile(String firstName, String lastName, String gender, LocalDate dateOfBirth, int height_In_Inches, int weight_in_Pounds){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height_In_Inches =height_In_Inches;
        this.weight_in_Pounds = weight_in_Pounds;
    }


    public void getFirstName() {
        System.out.println("First Name:" + firstName);
    }

    public void getLastName() {
        System.out.println("Last Name:" + lastName);

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void getHeight_In_Inches() {
        System.out.println("Height is:" + height_In_Inches);
    }

    public void setHeight_In_Inches(int height_In_Inches) {
        this.height_In_Inches = height_In_Inches;
    }

    public int getWeight_in_Pounds() {
        return weight_in_Pounds;
    }

    public void setWeight_in_Pounds(int weight_in_Pounds) {
        this.weight_in_Pounds = weight_in_Pounds;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void age() {
        this.age = Period.between(dateOfBirth,localDate).getYears();
        System.out.println("Age:" + age);
    }

    public void maximumHeartRate() {
         maximumHeartRate = (220) - age;
        System.out.println("Maximum Heart Rate:" + maximumHeartRate);

    }

    public void targetHeartRateRange(int intensity) {
        if (intensity >= 50 && intensity <= 85) {
            int heartRate = (intensity) * (maximumHeartRate);
            targetHeartRate = (heartRate) / 100;
        }
        System.out.println("The target heart rate is " + targetHeartRate);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

