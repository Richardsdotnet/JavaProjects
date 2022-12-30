package ChapterFive;

import java.util.Scanner;

public class ClassGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter grades from 0-100 or -1 stop");
        int grade = 0;
        while (grade != -1) {
            grade = input.nextInt();
            total += grade;
            gradeCounter++;
            switch (grade / 10) {
                case 8,9, 10 -> ++aCount;
                case 7 -> ++bCount;
                case 6 -> ++cCount;
                case 5 -> ++dCount;
                case 4 -> ++eCount;
                default -> ++fCount;
            }
        }
        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("total of the %d grades entered is: %d%n", gradeCounter, total);
            System.out.printf("Class average is: %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        } else {
            System.out.println("No grades were entered");
        }
    }
}



