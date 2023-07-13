package ChapterSevenArrays;


import java.util.Arrays;

public class ArrayMultiply {

    int[] array = {2, 4, 6, 3, 5, 1};
int[] newList;
    public int [] multiplyIndex(int[] array) {
        newList = new int[6];
        for (int i = 0; i < this.array.length; i++) {
            newList[i] = this.array[i] * this.array[i];
        }
        return newList;
    }


    public int[] ascendingSort(int[] array) {
        int newArr;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                newArr = array[i];
                array[i] = array[j];
                array[j] = newArr;
                }
            }
        }
        return array;
    }

    public int[] descendingSort(int[] array) {
        int newOne;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    newOne = array[i];
                    array[i] = array[j];
                    array[j] = newOne;
                }
            }

        }
        return array;

    }
}
