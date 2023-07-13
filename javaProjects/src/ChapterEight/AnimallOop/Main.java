package ChapterEight.AnimallOop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.bite());
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
