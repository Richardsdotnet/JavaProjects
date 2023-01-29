package ChapterFive;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("        Multiplication Table");
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%6d", i);
        }
            System.out.println("\n__________________________________________________________");
            for (int j = 1; j <= 9; j++) {
                System.out.printf(j + " | ");
                for (int i = 1; i <= 9 ; i++) {
                    System.out.printf("%6d", i * j);
                }
                System.out.println();
            }

        }
    }
