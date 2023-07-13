package ChapterThree;


import java.util.Scanner;

public class ClockMain {
    public static void main(String[] args) {

        Clock clock = new Clock(22, 50, 50);
        System.out.println("Time: " + clock.getHour() + ": "+ clock.getMinute() + ": "+ clock.getSecond());

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter hour");
        int hour = scanner.nextInt();
        clock.setHour(hour);

        System.out.println("enter minutes");
        int minutes = scanner.nextInt();
        clock.setMinute(minutes);

        System.out.println("enter seconds");
        int second = scanner.nextInt();
        clock.setSecond(second);

        System.out.println("Time: " +clock.getHour()+" : "+ + clock.getMinute()+" : " + clock.getSecond());


    }

}
