package chapterTwo;

public class Pyramid {
    int year1;
    int eachHour;
    double eachMinute;
    public int firstYearWeight(int weightInKg, int numOfStones) {

        year1 = weightInKg * numOfStones;
        System.out.printf("%d%n",year1);
        return year1;

    }

    public int weightPerHour(int weightPerYear, int hoursPerYear) {
         eachHour = weightPerYear / hoursPerYear;
        System.out.printf("%d%n", eachHour);
        return eachHour;

    }

    public double weightPerMinute(double weightPerYear, double minutesPerYear)  {
         eachMinute = weightPerYear/ minutesPerYear ;
        System.out.printf("%f%n", eachMinute);
        return eachMinute;
    }
}
