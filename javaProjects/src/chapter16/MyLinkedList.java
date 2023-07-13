package chapter16;

import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        String [] colors = {"Red", "Blue", "Green", "Brown"};

        List<String> list = new ArrayList<>(Arrays.asList(colors));

        String [] colors2 = {"Gold", "Purple", "Pink", "Cyan", "Yellow"};

        List<String> list2 = new ArrayList<>(Arrays.asList(colors2));

        list.addAll(list2);
        printMyList(list);
        toUpperCaseList(list);
        printMyList(list);
        removeItems(list,0,5);
        printMyList(list);
        changeToArray(list);
        sortList(list);
       printMyList(sortList(list));

    }

    private static List<String> sortList(List<String> list) {
        String [] sortedList = {"goat", "Zebra", "Apple", "Ball", "Car"};
        List<String> list1 = new ArrayList<>(Arrays.asList(sortedList));
        Collections.sort(list1, Collections.reverseOrder());
       // list1.sort(Collections.reverseOrder());
        return list1;
    }

    private static void printMyList(List<String> list) {
        for (String color: list) {
            if (color != null){
            }
            System.out.println(color);
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start,end).clear();
    }

    public static void reversedOutput(List<String> list) {
        ListIterator<String>listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()){
            String previous = listIterator.previous();
            System.out.println(previous);
        }
    }

    private static void toUpperCaseList(List<String> list) {
        ListIterator<String>listIterator = list.listIterator();

        while (listIterator.hasNext()){
            String color = listIterator.next();
            listIterator.set(color.toUpperCase());
        }
    }

    private static void changeToArray(List<String>list){
        String [] colors = {"Red", "Blue", "Green", "Brown"};

        List<String> list4 = new ArrayList<>(Arrays.asList(colors));

        colors = list.toArray(new String[list4.size()]);

        for (String color: colors) {
            System.out.println(color);
        }

    }
}
