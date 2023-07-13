package Tasks;

import java.util.Arrays;

public class AlternatingElements {
    public static void main(String[] args) {


        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int n1 = array1.length;
        int n2 = array2.length;

        int [] array3 = new int[n1 + n2];
        System.out.println();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            array3[k++] = (array1[i++]);
            array3[k++] = (array2[j++]);
        }

            while ( i < n1)
                array3[k++] =(array1[i++]);
            while (j < n2)
                array3[k++] = array2[j++];
        System.out.println(Arrays.toString(array3));
        }

    }

