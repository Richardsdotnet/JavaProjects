package Tasks;


public class ListOddPrinting {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 68, 76, 45, 34, 23};
        //even numbers index
        for (int i = 1; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println();
        //odd numbers index
        for (int i = 1; i < numbers.length; i += 2) {
                System.out.println(numbers[i]);
            }
            System.out.println();

            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            }
        System.out.println();

            //Running total of the list
            int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("The total of the array elements is: " + total);
        }


    }
