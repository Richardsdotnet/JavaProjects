package chapterEleven.microFinanceBank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Chris", new BigDecimal(20));
        try {
            String message = customer.withdraw(40);
            System.out.println(message);
            System.out.println(customer);
            System.exit(0);
        }catch (TrenchesException exception){
            System.out.println("Error:" + exception.getMessage());
        }finally {
            System.out.println(customer);
            System.out.println("Thanks for banking with us");
        }
    }
}
