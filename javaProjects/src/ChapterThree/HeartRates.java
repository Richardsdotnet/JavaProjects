package ChapterThree;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;

    private int day;
    private int yearOfBirth;
    private int maximumHeartRate;
    private int intensity;
    private int targetHeartRate;
    private int ageInYears;

    private int currentYear;

    public HeartRates(String firstName, String lastName, int day, int month, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonth() {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay() {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYearOfBirth() {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setCurrentYear() {
        this.currentYear = currentYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int ageInYears() {
        currentYear = 2022;
        ageInYears = (currentYear) - (yearOfBirth);
        return ageInYears;
    }


    public int maximumHeartRate() {
        maximumHeartRate = (220) - (ageInYears);
        return maximumHeartRate;

    }

    public int targetHeartRatePercentage() {
         intensity = 50;
        if (intensity >= 50 && intensity <= 85) {
            targetHeartRate = (intensity) * (maximumHeartRate);
        }
        return targetHeartRate;
    }
}
