package ChapterFive;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    Scanner input = new Scanner(System.in);
    private int correctAnswerCounter = 0;


    public void quizQuestions(){
        System.out.println ("""
                If the atmosphere is removed from the earth
                (a) Day will lengthen
                (b) Night will lengthen
                (c) Both will remain the same
                (d) Both will be equal
                """);
        System.out.println("Enter the correct option from a - d ");
        String userInput = input.next();
        if(userInput.equalsIgnoreCase("c")){
            System.out.println("correct");
            correctAnswerCounter++;
        }else {
            System.out.println("wrong");
        }
        System.out.println("""
                The environmental causes of skin cancer, cataract and mutation is:
                (a) acid rain
                (b) global warming
                (c) Nuclear winter
                (d) ozone depletion
                """);
         userInput = input.next();
         if(userInput.equalsIgnoreCase("d")){
             System.out.println("correct");
             correctAnswerCounter++;
         }else {
             System.out.println("wrong");

         }
        System.out.println("""
                 The gas that contributes most to the greenhouse effect is
                (a) CFC
                (b) Freon
                (c) CO2
                (d) CH4
                """);
        userInput = input.next();
        if(userInput.equalsIgnoreCase("c")){
            System.out.println("correct");
            correctAnswerCounter++;
        }else {
            System.out.println("wrong");

        }
        System.out.println("""
                 ‘Green House Effect’ means
                (a) Pollution in homes in tropical regions
                (b) Trapping of solar energy due to atmospheric oxygen
                (c) Trapping of solar energy due to atmospheric carbon dioxide
                (d) Cultivation in green houses so as to check pollution
                """);
        userInput = input.next();
        if(userInput.equalsIgnoreCase("c")){
            System.out.println("correct");
            correctAnswerCounter++;
        }else {
            System.out.println("wrong");

        }
        System.out.println("""
                The largest glacier in the world is—
                (a) Siachin
                (b) Lambert Fisher
                (c) Flade Isblink
                (d) Vatnajokull
                """);
        userInput = input.next();
        if(userInput.equalsIgnoreCase("b")){
            System.out.println("correct");
            correctAnswerCounter++;
        }else {
            System.out.println("wrong");

        }
        switch (correctAnswerCounter) {
            case 5 -> {
                correctAnswerCounter++;
                System.out.println("Excellent");
            }
            case 4 -> {
                correctAnswerCounter++;
                System.out.println("very Good");
            }
            case 3, 2, 1 -> {
                correctAnswerCounter++;
                System.out.println("Time to brush up on your knowledge of global warming");
                System.out.println();
            }
        }

    }

}
