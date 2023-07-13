package ChapterEight;

import java.util.ArrayList;
import java.util.Arrays;

public class Trry {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 8, 6, 20};
        // System.out.println(oddNumber(numbers));
        int[] elements = {2, 4, 3, 1, 8};
       // System.out.println(Arrays.toString(doubleElements(elements)));
        int [] high = {1,8,3,5,2};
        System.out.println(Arrays.toString(lowestElement(high)));
    }

    public static ArrayList<Integer> oddNumber(int[] numbers) {
        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                items.add(numbers[i]);
            }

        }
        return items;
    }

    int[] elements = {2, 4, 3, 1, 8};
    public static int[] doubleElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
           elements[i] = elements[i] * 2;
        }

        return elements;
    }



    public static int [] highestElement(int [] inputElements){
        int highestNumber = inputElements[0];
        for (int number: inputElements) {
            if(number > highestNumber) highestNumber = number;
        }
         return new int[]{highestNumber};
    }

    public static int [] lowestElement(int [] inputElements){
        int lowestNumber = inputElements[0];
        for (int number: inputElements) {
            if(number < lowestNumber) lowestNumber = number;
        }
        return new int[]{lowestNumber};
    }

//    int total = 0;
//    for(int i = 0; i < bills.length; i++){
//         bill.add(int itemPrice);
//        total = bill.getTotal();
//    }
}


