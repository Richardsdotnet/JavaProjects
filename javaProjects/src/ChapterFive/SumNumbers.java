package ChapterFive;

import java.util.Scanner;

public class SumNumbers {


    public static int sum(int a, int b){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");

        a = input.nextInt();
         b = input.nextInt();
        return a*b ;
    }



    public static void main(String[] args) {
        System.out.println(sum(5,8)) ;
    }
    }