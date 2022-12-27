package ChapterFour.ChristmasSnacks;

import java.util.Scanner;

public class ClassAverageCalculator1 {
    int total;
    int grade;

    int gradeCounter = 1;

    double average;
    Scanner input = new Scanner(System.in);

    public void classAverage() {

        while (gradeCounter < 10) {
            System.out.println("Enter Grade");
            grade = input.nextInt();
            total  = total  + grade;
            gradeCounter = gradeCounter + 1;
        }
         average = (double) total / gradeCounter;
        System.out.printf("The total grade is: %d%n", total);
        System.out.printf("The class Average is: %f%n", average);
    }

}