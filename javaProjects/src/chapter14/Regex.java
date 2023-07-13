package chapter14;

public class Regex {
    public static void main(String[] args) {
        String name = "Elites";
        System.out.println(name.matches("[A-z]+"));
        String name2 = "Ade";
        System.out.println(name2.matches("[a-z]+[A-Z]"));
        String atoz = "WeAreLucky123@###Lucky";

        String email = "Native@gmail.com";
        System.out.println(email.matches("[A-z]+@gmail.com"));
        String phoneNumber = "0800-000-9981";
        System.out.println(phoneNumber.matches("\\d{4}-\\d{3}-\\d{4}"));
        System.out.println(phoneNumber.matches("[0-9]{4}-[0-9]{3}-[0-9]{4}"));


    }

    private boolean passwordMatches(String password){
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*()_+!~]).{8,}$");
    }

}
