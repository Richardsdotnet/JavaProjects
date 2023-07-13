package ChapterSevenArrays;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList <String> taskItems = new ArrayList<>();
        taskItems.add("Jenny");
        taskItems.add("Jenny");
        taskItems.add("Jenny");
        taskItems.add("Jenny");
        taskItems.add("Jenny");
        taskItems.add(3,"Johny");

        for (int i = 0; i < taskItems.size(); i++) {
            System.out.println(taskItems.get(i));

        }
    }

}