package Nokia;

import java.util.Scanner;

public class Nokia {
    Scanner input = new Scanner(System.in);

   public void errorMessageDisplay() {
       System.out.println("Invalid input, select a valid input");
}
public void displayMenuUserInput() {
    int userInput = input.nextInt();
    switch (userInput) {
        case 1 -> phoneBookMenu();
        case 2 -> messagesMenu();
        case 3 -> callRegisterMenu();
        case 4 -> chatsMenu();
        case 5 -> tonesMenu();
        case 6 -> settingsMenu();
        case 7 -> callDivertsMenu();
        case 8 -> gamesMenu();
        case 9 -> calculatorMenu();
        case 10 -> remindersMenu();
        case 11 -> clockMenu();
        case 12 -> profilesMenu();
        case 13 -> simServiceMenu();
        default -> errorMessageDisplay();
    }
}

    public void displayMenu() {
        System.out.println( """
                Welcome!!!
                Enter
                1. Phonebook
                2. Messages
                3. Call register
                4. Chats
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim Services
                 """);

             displayMenuUserInput();

        }



    private void phoneBookMenu() {
        System.out.println("""
                1.Search
                2.Service Nos.
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send business card
                8.Options
                    1.Type of view
                    2.Memory status
                9.Speed dials
                10.Voice tags
                """);
    }

    private void messagesMenu() {
        System.out.println("""
                Messages
                1.Write messages
                2.Inbox
                3.Outbox
                4.Picture messages
                5.Templates
                6.Smileys
                7.Message settings
                    1.Set 1
                      1.Message center number
                      2.Message sent as
                      3.Message validity
                    2.Common
                      1.Delivery reports
                      2.Reply via same centre
                      3.Character support
                        
                """);
    }

    private void callRegisterMenu() {
        System.out.println("""
                Call register
                1.Missed calls
                2.Received call
                3.Dialled calls
                4.Erase recent call list
                5.Show call duration
                6.Show call cost
                7.Call cost settings
                8.Prepaid credit
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Received calls");
            case 3 -> System.out.println("Dialled calls");
            case 4 -> System.out.println("Erase recent call list");
            case 5 -> callDuration();
            case 6 -> callCost();
            case 7 -> callCostSettings();
            case 8 -> System.out.println("Prepaid credit");
            default -> errorMessageDisplay();

        }
        loopUserChoice();


    }
    public void loopUserChoice(){
        String userChoice;
        do {
            System.out.println("Do you wish to continue? Yes or No");
            userChoice = input.next();
            if (userChoice.equalsIgnoreCase("Yes")) {
                displayMenu();
            } else {
                System.exit(0);
            }
        } while
        (userChoice.equalsIgnoreCase("Yes"));
    }
    public void callDurationUserInput() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("Last call duration");
            case 2 -> System.out.println("All call duration");
            case 3 -> System.out.println("Received call duration");
            case 4 -> System.out.println("Dialled call duration");
            case 5 -> System.out.println("Clear timers");
            default ->errorMessageDisplay();

        }
    }
    public void callDuration(){
        System.out.println("""
                    1.Last call duration
                    2.All calls' duration
                    3.Received calls' duration
                    4.Dialled calls' duration
                    5.Clear timers
                """);
                callDurationUserInput();
                loopUserChoice();


        }
public void callCostUserInput() {
    int userInput = input.nextInt();
    switch (userInput) {
        case 1 -> System.out.println("Last call cost");
        case 2 -> System.out.println("All call cost");
        case 3 -> System.out.println("Clear counters");
        default -> errorMessageDisplay();
    }
}
    public void callCost(){
        System.out.println("""
                    1.Last call cost
                    2.All calls' cost
                    3.Clear counters
                """);
       callCostUserInput();
       loopUserChoice();
        }

    public void callCostSettings() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("Call cost limit");
            case 2 -> System.out.println("Show costs in");
            default -> errorMessageDisplay();
        }
    }

    private void chatsMenu() {
        System.out.println("""
                Chats
                1.Facebook
                2.Whatsapp
                3.Instagram
                4.Twitter
                """);
    }

    private void tonesMenu() {
        System.out.println("""
                Tones
                1.Ringing tone
                2.Ringing volume
                3.Incoming call alert
                4.Composer
                5.Message alert tone
                6.Keypad tones
                7.Warning and games tones
                8.Vibrating alert
                9.Screen saver
                """);
    }

    private void settingsMenu() {
        System.out.println("""
                Settings
                1.Call settings
                    1.Automatic redial
                    2.Speed dialling
                    3.Call waiting options
                    4.Own number sending
                    5.Phone line in use
                    6.Automatic answer
                2.Phone settings
                    1.Language
                    2.Cell info display
                    3.Welcome note
                    4.Network selection
                    5.Lights
                    6.Confirm SIM service actions
                3.Security settings
                    1.PIN code request
                    2.Call baring service
                    3.Fixed dialling
                    4.Closed user group
                    5.Phone security
                    6.Change access code
                  
                4.Restore factory settings
                """);
    }

    private void callDivertsMenu() {
        System.out.println("""
                Call diverts
                1.Incoming call diverts
               """);
    }

    private void gamesMenu() {
        System.out.println("""
              Games
              1.Snake
              2.Puzzle
              """);
    }

    private void calculatorMenu() {
        System.out.println("""
             Calculator
             1.Scientific calculator
             """);
    }

    private void remindersMenu() {
        System.out.println("""
             Reminders
             1.All reminders
             """);
    }

    private void clockMenu() {
        System.out.println("""
                Clock
                1.Alarm clock
                2.Clock settings
                3.Date settings
                4.Stopwatch
                5.Countdown
                6.Auto update of date and time
                """);
    }

    private void profilesMenu() {
        System.out.println("""
                Profiles
                1.General
                2.Silent
                3.Meeting
                """);
    }

    private void simServiceMenu() {
        System.out.println("""
                Sim services
                1.Glo
                2.Airtel
                3.MTN
               """);
    }


}