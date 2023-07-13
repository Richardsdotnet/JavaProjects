package ChapterFive;

public class CalculatePie {
    public static void main(String[] args) {
        double pi = 0.0;
        int sign = 1;
        for (int i = 1; i <= 200000; i += 2) {
            pi += sign * 4.0 / i;
            sign = -sign;
            if (i % 10000 == 1) {
                System.out.printf("%d\t%.4f\n", i, pi);
                if (String.format("%.5f", pi).equals("3.14160")) {
                    System.out.printf("First occurrence at term %d\n", i);
                    break;
                }

            }
        }
    }

    public void pie() {
        int numerator = 4;
        int denominator = 1;
        int sum = 0;
        for (int i = 0; i <= 200000; i++) {
            if (i % 2 == 0) {
                sum += numerator / denominator;
            }
        }


    }
}

