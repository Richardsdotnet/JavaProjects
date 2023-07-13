package Tasks;

public class ListConcatenaton {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5, 6};
        int [] array2 = {7, 8, 9, 10};
        int n1 = array1.length;
        int n2 = array2.length;
       // int [] array3;
       int array3 = n1 + n2;
        System.out.println(array3 + n1 + n2);
    }
}
