package ChapterSevenArrays;

import java.util.Scanner;

public class GradesArray {

    Scanner input = new Scanner(System.in);
    int[] studentGrades;
    int gradeCounter;
    int grade;



        public void setStudentsGrades(int[] studentGrades) {
            this.studentGrades = studentGrades;

            for (gradeCounter = 0; gradeCounter < studentGrades.length; gradeCounter++) {
                System.out.println("Enter grade");
                grade = input.nextInt();
                if (grade > 0 && grade <= 100) {
                    studentGrades[gradeCounter] = grade;

                } else {
                    System.out.println("Invalid input");
                }
            }
        }

        public void highestGrade() {
            int maximumGrade = studentGrades[0];
            for( int grade : studentGrades){
                if(grade > maximumGrade){
                    maximumGrade = grade;
                }
            }
            System.out.println("The maximum grade is: " + maximumGrade);
        }
    public void lowestGrade() {
            int minimumGrade = studentGrades[0];
            for (int grade:studentGrades) {
                if (grade < minimumGrade){
                    minimumGrade = grade;
                }

            } System.out.println("The minimum grade is: " + minimumGrade);


    }
    public void gradeAverage() {
            int average = 0;
            int totalOfGrades = 0;
            for(int grade : studentGrades){
                totalOfGrades += grade;
                average = totalOfGrades / studentGrades.length;

            }
            System.out.println("The average of the grades is: " + average);
    }
            }


