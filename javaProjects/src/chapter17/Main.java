package chapter17;

public class Main {
    public static void main(String[] args) {
        Flyable plane = () -> {
            System.out.println("I am a plane flying!");

        };
        plane.fly();

        Flyable kite = () -> {
            System.out.println("I am a kite flying!");
        };
        kite.fly();

        Flyable bird = () -> {
            System.out.println("I am a bird flying!");
        };
        bird.fly();
    }
}
