package ChapterFive;

public class IntegerDivision {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number < 30; number++) {
            if (number % 3 == 0) {
                sum += number;
            }
        }
        System.out.printf("The sum of numbers divisible by 3 from 1-30 is: %d%n",sum);
    }
}