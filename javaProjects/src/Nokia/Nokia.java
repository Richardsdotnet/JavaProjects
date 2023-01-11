package Nokia;

import java.util.Scanner;

public class Nokia {
    Scanner input = new Scanner(System.in);
    public String displayMenu(){
        return """
                Welcome!!!
                Enter 1 ->  for phonebook
                2 -> for messages
                3 -> for call register
                4 -> for Settings
                5 -> for Games
                6 -> for Extras
                 """;
    }
    public  void messageMenu(){
        System.out.println("""
                1 -> Create Message
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                """);
    }
    public  void callRegMenu(){
        System.out.println("""
                1 -> Dialled calls
                2 -> Missed calls
                3 -> Received calls
                """);
    }
    public  void settingsMenu(){
        System.out.println("""
                1 -> Tone Settings
                2 -> Profile Settings
                3 -> Bluetooth
                """);
    }
    public  void extraMenu(){
        System.out.println("""
                1 -> Calculator
                2 -> Torchlight
                3 -> Calender
                """);
    }
    public void userSelection(){

        int userInput = input.nextInt();
        switch (userInput){
            case 2:messageMenu();
                break;
            case 3:callRegMenu();
                break;
            case 4:settingsMenu();
                break;
            case 5:extraMenu();
            default:
                System.out.println("Invalid input");
                break;
        }

        String userChoice;
        do{
            System.out.println("Do you wish to continue? yes/no");
            userChoice = input.next();
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.println(displayMenu());
                userSelection();
            }
        } while (userChoice.equalsIgnoreCase("yes"));


    }

}
