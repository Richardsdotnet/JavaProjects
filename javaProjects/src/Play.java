
import java.security.SecureRandom;

public class Play {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        for (int counter = 1; counter <= 10; counter++){
            int number = secureRandom.nextInt(10);
            System.out.printf("%2d", number);
            if(counter % 5 == 0){
                break;
            }  System.out.println();
        }

    }
}


