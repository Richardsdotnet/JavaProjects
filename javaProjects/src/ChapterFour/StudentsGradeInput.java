package ChapterFour;

import java.util.Scanner;

public class StudentsGradeInput {
    private static int total = 0;
    public  static int numberOfStudent = 5;

   //counter controlled loop.
    public static void studentGrade() {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter grades 5 students");
        double gradeInput = input.nextDouble();
        int gradeCounter = 1;
        while (gradeCounter < numberOfStudent) {
            if (gradeInput  > 0) {
                System.out.println("Enter grades");
                gradeInput = input.nextInt();
                total += gradeInput;
                gradeCounter++;
            }
        }

    }


    //Sentinel controlled loop
    public  static void sentinelControlledGradesInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade or -1 to quit");
        double inputGrade = input.nextDouble();
        double gradeCounter = 0;
        while (inputGrade != -1) {
            if (inputGrade  > 0) {
                System.out.println("Input grades");
                inputGrade = input.nextInt();
                total += inputGrade;
                gradeCounter = gradeCounter + 1;

            }

        }
    }

    public static void classAverage(){
        double average = (double) total / numberOfStudent;
        System.out.println("The total of all the grades inputted is: " + total);
        System.out.println("THe class average is: " + average);
    }





    public static void main(String[] args) {
        studentGrade();
        classAverage();
        sentinelControlledGradesInput();
        classAverage();
    }
}