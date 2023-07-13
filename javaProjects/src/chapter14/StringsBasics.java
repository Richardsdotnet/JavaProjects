package chapter14;

public class StringsBasics {
    public static void main(String[] args) {
        String name = "Elites";
        String name2 = new String("Elites");
        String name3 = name2.intern();
        System.out.println(name.equals(name2));
        System.out.println(name == name2);
        System.out.println(name3.equals(name2));
        System.out.println(name2 == name3);

    }
}