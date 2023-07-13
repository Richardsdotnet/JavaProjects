package ChapterEight.AnimallOop;

public class Dog extends Animal{
    private String tail;

    public String bite(){
        return"Make noise and i bite you";
    }

    @Override
    public String makeSound(){
        return "whoof whoof whoof";
    }
}
