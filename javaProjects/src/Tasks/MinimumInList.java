package Tasks;

public class MinimumInList {
    public static void main(String[] args) {

        int[] arrays = {5, 2, 34, 3, 5, 6, 10, 12, 23};
        int min = arrays[0];
        for (int i : arrays) {
            if(i < min)
                min = i;
        }
        System.out.println("The min  is: " + min);
        }
        }

