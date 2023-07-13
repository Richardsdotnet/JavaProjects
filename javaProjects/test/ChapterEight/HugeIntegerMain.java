package ChapterEight;

import org.junit.platform.engine.support.hierarchical.Node;

import java.math.BigInteger;
import java.util.Arrays;

public class HugeIntegerMain {
    public static void main(String[] args){
        HugeInteger hugeInteger = new HugeInteger(2);
       HugeInteger hugeInteger1 = new HugeInteger(2);
       hugeInteger.valueOf("88");
       hugeInteger1.valueOf("99");
        System.out.println(hugeInteger.add(hugeInteger1));
        System.out.println(hugeInteger.subtract(hugeInteger1));
        System.out.println(hugeInteger.multiply(hugeInteger1));
        System.out.println(hugeInteger.isGreaterThan(hugeInteger1));
        System.out.println(hugeInteger.isLessThan(hugeInteger1));



    }
    }


