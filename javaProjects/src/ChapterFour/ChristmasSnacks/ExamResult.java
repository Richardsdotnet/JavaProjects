package ChapterFour.ChristmasSnacks;

import java.util.Scanner;

public class ExamResult {
    int passed;
    int failed;
    int status;
    int studentCounter;
    int passedCounter;
    int failedCounter;
    Scanner input = new Scanner(System.in);

    public void inputResult() {
        studentCounter = 0;
        while (studentCounter < 10) {
            System.out.println("Enter status( 1 for passed and 2 for failed): ");
            status = input.nextInt();
            if (status == 1){passed += 1;}
                else {failed += 1;}
                studentCounter += 1;
                passedCounter += 1;
                failedCounter += 1;
            }
        System.out.printf("Passed: %d%nFailed: %d%n", passed,failed);
        if(passed > 8){
            System.out.println("Bonus to instructor");
        }
        }
    }
