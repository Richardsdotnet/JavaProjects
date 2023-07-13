package ChapterEight.AnimallOop;

public class Animal {
    private int numberOfEyes;
    private int numberOfLegs;
    private String complexion;


    public void move(){
        System.out.println("Moving...");
    }

   public String makeSound(){
        return "making sound";
    }
    public void eat(){
        System.out.println("Eating");

    }
}
