package ChapterSevenArrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
    int [] myArray = {2,5,3,1,9,4,7,2,5,0};
        int[] sortedArray = descendingSorts(myArray);
        System.out.println(Arrays.toString(sortedArray));
        int [] sortedArray2 = ascendingSort(myArray);
        System.out.println(Arrays.toString(sortedArray2));
    }

    public static int[] descendingSorts(int[] array) {
        int[] sortedArray = new int[array.length];
       System.arraycopy(array,0, sortedArray ,0, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                }
            }

        }
        return sortedArray;


    }

    public static int [] ascendingSort(int [] array){
        int [] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if(sortedArray[i] > sortedArray[i + 1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                flag = true;
            }

            }
        }
        return sortedArray;
    }
}
