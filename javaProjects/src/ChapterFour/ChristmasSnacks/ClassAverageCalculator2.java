package ChapterFour.ChristmasSnacks;

import java.util.Scanner;

public class ClassAverageCalculator2 {
    int grade = 0;
    int total = 0;
    int gradeCounter = 0;
    double average;

    Scanner input = new Scanner(System.in);


    public void classAverage2() {
        System.out.println("Enter grade or -1 to quit");
        grade = input.nextInt();
        while (grade != -1) {
            total = total + grade;
            gradeCounter++;
            System.out.println("Enter grade or -1 to quit");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;
            System.out.printf("The total of the grades entered is: %d%n", total);
            System.out.printf("The class Average is: %f%n", average);
        }
    }
}