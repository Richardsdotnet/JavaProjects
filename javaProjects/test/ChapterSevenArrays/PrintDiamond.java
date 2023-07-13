package ChapterSevenArrays;

public class PrintDiamond {

    public static void main(String[] args) {
        diamondShape(5);
    }
    public static void diamondShape(int n) {
        for (int i = 1; i <= n; i++) {
            int gap = n - i;
            for (int j = 1; j <= gap; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            int gap = n - i;
            for (int j = 1; j <= gap; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
