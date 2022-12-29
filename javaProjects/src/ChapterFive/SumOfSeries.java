package ChapterFive;

public class SumOfSeries {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        System.out.printf("%s%7s%n", "number","sum");
        for (int number = 1; number < 100; number++){
            sum += number;
            counter++;
            System.out.printf("%d%12d%n",counter,sum);
        }

    }

}
