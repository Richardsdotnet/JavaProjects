package chapterTwo;

public class Population {
    int firstIncrement;
    double secondIncrement;

    public int firstYearIncrement(int percentage, int population){
      firstIncrement = population + percentage;
        System.out.printf("%d%n",firstIncrement);
        return firstIncrement;
    }

    public double secondYearIncrement(double percentage, double population) {
        secondIncrement =  percentage  + firstIncrement;
        System.out.printf("%f%n", secondIncrement);
        return secondIncrement;
    }

    public double thirdYearIncrement(double percentage, double population) {
        return population + percentage;
    }

    public double forthYearIncrement(double percentage, double population) {
        return percentage + population;
    }
}
