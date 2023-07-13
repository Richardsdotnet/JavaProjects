package ChapterEight.AnimallOop;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final List<User>users = new ArrayList<>();
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void greet(){
        for (User user : users) {
            System.out.println("Hello " + user);
        }
        System.out.println("Hello " + name);
    }

    public void add (User user){
        users.add(user);
    }

}
