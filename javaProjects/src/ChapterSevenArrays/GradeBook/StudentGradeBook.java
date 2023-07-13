package ChapterSevenArrays.GradeBook;

import java.util.Scanner;

public class StudentGradeBook {

    private final int[][] gradeBook;

    public StudentGradeBook( int[][] gradeBook) {
        this.gradeBook = gradeBook;
    }

    public void gradesInput() {
        Scanner input = new Scanner(System.in);

        int grades = 0;
        for (int i = 0; i < gradeBook.length; i++) {
            for (int j = 0; j < gradeBook[i].length ;  j++) {
                System.out.println("Enter student grades");
                grades = input.nextInt();
                gradeBook[i][j] = grades;
            }



        }
        System.out.println(grades);
    }
    public void processGrades() {
        outputGrades();
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

    }


    private int getMaximum() {

        int higherGrade = gradeBook[0][0];
        for (int[] studentGrades : gradeBook) {
            for (int grade : studentGrades) {
                if (grade > higherGrade) {
                    higherGrade = grade;
                }
            }
        }
        return higherGrade;
    }

    private int getMinimum() {

        int lowGrade = gradeBook[0][0];

        for (int[] studentGrades : gradeBook) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }


    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            ");


        for (int test = 0; test < gradeBook[0].length; test++) {
            System.out.printf("  Test %d ", test + 1);
        }

        System.out.println(" Average");


        for (int student = 0; student < gradeBook.length; student++) {
            System.out.printf("Student %d", student + 1);
            for (int test : gradeBook[student]) {
                System.out.printf("%8d", test);
            }

            double average = getAverage(gradeBook[student]);
            System.out.printf("%9.2f%n", average);
        }


    }
}