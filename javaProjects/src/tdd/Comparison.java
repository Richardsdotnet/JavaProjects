package tdd;

public class Comparison {
    public int addThreeIntegers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int averageThreeIntegers(int num1, int num2, int num3) {
        return (num1 + num2 + num3)/3;
    }

    public int productOfThreeIntegers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int findMinimumOfThreeIntegers(int num1, int num2, int num3) {
        if(num1 < num2 && num1 < num3){return num1;}

        else if (num2 < num1 && num2 < num3) {return num2;}

        else {return num3;}
    }

    public int maximumInteger(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3){return num1;}
        else if(num2 > num1 && num2 > num3){return num2;}
        else {return num3;}
    }

    public int squareOfSumOfThreeIntegers(int num1, int num2, int num3) {
        return (num1 + num2 +num3);
    }
}

