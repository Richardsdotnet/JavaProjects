package ChapterSevenArrays;

import java.util.Scanner;

public class GradesArrayMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradesArray gradesArray = new GradesArray();
        System.out.println("Enter subjects number");
        int subjectsNumb = input.nextInt();
        int[] studentGrades = new int[subjectsNumb];
        gradesArray.setStudentsGrades(studentGrades);
        gradesArray.gradeAverage();
        gradesArray.highestGrade();
        gradesArray.lowestGrade();
    }
}
