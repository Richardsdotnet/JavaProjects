package ChapterFive;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.06;
        System.out.printf("%3s%15s%n", "Year", "Deposit");
        for(int year = 5; year < 10; year++){
            double amount = principal * Math.pow(1.0 + rate,year);
            System.out.printf("%2d%20f%n", year,amount);
        }

    }
}
