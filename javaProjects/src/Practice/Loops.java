package Practice;

public class Loops {
    public static void main(String[] args) {
        //while loop
        int counter = 0;
        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        }

        // for loop

        for (int count = 0; count <= 5; count++) {
            System.out.println(count);
        }
        // do
        int countNo = 0;
        do {
            System.out.println(countNo);
            countNo++;
        }while ( countNo <= 5);

    }
}
