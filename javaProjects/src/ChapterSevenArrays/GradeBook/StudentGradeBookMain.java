package ChapterSevenArrays.GradeBook;

import java.util.Scanner;

public class StudentGradeBookMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter number of subjects");
        int numberOfSubjects = input.nextInt();
        int [][] gradeBook = new  int[numberOfStudents][numberOfSubjects];
        StudentGradeBook studentGradeBook = new StudentGradeBook( gradeBook);
        studentGradeBook.gradesInput();
        studentGradeBook.processGrades();


    }




}
