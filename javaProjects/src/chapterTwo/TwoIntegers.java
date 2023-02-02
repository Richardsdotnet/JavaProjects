package chapterTwo;

public class TwoIntegers {
    int firstIntegerSquare;
    int secondIntegerSquare;
    int squareOfIntegers;

    int integersSquareDiff;


    public int squareOfFirstIntegers(int num1) {
        firstIntegerSquare = (num1 * num1);
        System.out.printf("%d%n",firstIntegerSquare);
        return firstIntegerSquare;

      }

   public int squareOfSecondIntegers(int num2) {

       secondIntegerSquare = (num2 * num2);
       System.out.printf("%d%n",secondIntegerSquare);
       return secondIntegerSquare;
    }

    public int sumOfSquareOfTwoIntegers(int num1, int num2) {
         squareOfIntegers = (num1 * num1) + (num2 * num2);
        System.out.printf("The sum of square of the two integers is: %d%n",squareOfIntegers);
        return squareOfIntegers;
    }
    public int sumOfSquareDifference(int num1, int num2) {
        integersSquareDiff = (num1 * num1) - (num2 * num2);
        System.out.printf("%d%n", integersSquareDiff);
        return integersSquareDiff ;
    }
}
