//package ChapterEight;
//
//import org.junit.jupiter.api.Test;
//
//class TimeTest {
//    @Test
//    public void testTest(){
//        TimeValidator time = new TimeValidator(34, 50,34);
//
//    }
//
//
//    public HugeInteger(String s){
//        intArray = new int[40];
//        numDigits = 0;
//        parse(s);// call parse(s)
//    }
//
//    public HugeInteger( ){
//        intArray = new int[40];
//        numDigits = 0;
//
//    }
//
//    public void parse(String s){
//        // Add each digit to the arrays
//        // update numDigits
//        for (int i = 0; i < s.length(); i++){
//            intArray[i] = s.charAt(i) - '0';
//            System.out.print(intArray[i] + "");
//            numDigits++;
//            System.out.print(intArray[i] + "" + numDigits);
//        }
//    }
//
//    public static HugeInteger add(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // Create hugeInt3
//        // Loop
//        //    Add digits from hugeInt1 and hugeInt2,
//        //    Store in corresponding hugeInt3
//        // End
//        //
//        // return hugeInt3
//        HugeInteger hugeInt3 = new HugeInteger();
//        for (int i = 0; i < hugeInt3.intArray.length; i++){
//            hugeInt3.intArray[i] = hugeInt1.intArray[i] + hugeInt2.intArray[i];
//        }
//        String data = hugeInt3.intArray.toString();
//        for (int j = 0; j < data.length(); j++)
//            System.out.println(hugeInt3.intArray[j]);
//        return hugeInt3;
//    }
//
//    public static HugeInteger subtract(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // Create hugeInt3
//        // Loop
//        //    Subtract hugeInt2 digit from  hugeInt1,
//        //    Store in corresponding hugeInt3
//        // End
//        //
//        // return hugeInt3
//        HugeInteger hugeInt4 = new HugeInteger();
//        for (int i = 0; i < hugeInt1.intArray.length; i++){
//            if (hugeInt1.intArray[i] > hugeInt2.intArray[i])
//                hugeInt4.intArray[i] = hugeInt1.intArray[i] - hugeInt2.intArray[i];
//            else
//                hugeInt4.intArray[i] = hugeInt2.intArray[i] - hugeInt1.intArray[i];
//        }
//
//        String data = hugeInt4.intArray.toString();
//        for (int j = 0; j < data.length(); j++)
//            System.out.println(hugeInt4.intArray[j]);
//        return hugeInt4;
//
//    }
//
//    public static boolean isEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // return true if the value represented by
//        // elements of hugeInt1.intArray is equal to
//        // value represented by elements of hughInt2.intArray
//        for (int i = 0; i < hugeInt2.intArray.length; i++)
//            System.out.println(hugeInt2.intArray[i]);
//        int count = 0;
//
//        for (int i = 0; i < hugeInt2.numDigits; i++){
//            int a1= hugeInt1.intArray[i];
//            int a2 = hugeInt2.intArray[i];
//            System.out.println(a1 + " " + a2);
//            if (a1 != a2){
//                System.out.println(hugeInt2.intArray[i]);
//                count++;
//            }
//        }
//
//        System.out.println("count" + count);
//        return count <= 0;
//    }
//
//    public static boolean isNotEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // return true if the value represented by
//        // elements of hugeInt1.intArray is not equal to
//        // value represented by elements of hughInt2.intArray
//
//        for (int i = 0; i < hugeInt2.intArray.length; i++)
//            System.out.println(hugeInt2.intArray[i]);
//        int count = 0;
//
//        for (int i = 0; i < hugeInt2.numDigits; i++){
//            int a1 = hugeInt1.intArray[i];
//            int a2 = hugeInt2.intArray[i];
//            System.out.println(a1 + " " + a2);
//            if (a1 != a2){
//                System.out.println(hugeInt2.intArray[i]);
//                count++;
//            }
//        }
//        System.out.println("count" + count);
//        return count > 0;
//    }
//
//    public static boolean isGreaterThan(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // return true if the value represented by
//        // elements of hugeInt1.intArray is greater than
//        // value represented by elements of hughInt2.intArray
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < hugeInt1.intArray.length; i++){
//            sum1 += hugeInt1.intArray[i];
//            sum2 += hugeInt1.intArray[i];
//        }
//
//        return sum1 > sum2;
//
//    }
//
//    public static boolean isLessThan(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // return true if the value represented by
//        // elements of hugeInt1.intArray is less than
//        // value represented by elements of hughInt2.intArray
//
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < hugeInt1.intArray.length; i++){
//            sum1 += hugeInt1.intArray[i];
//            sum2 += hugeInt1.intArray[i];
//        }
//        return sum1 >= sum2;
//    }
//
//    public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2){
//        // return true if the value represented by
//        // elements of hugeInt1.intArray is greater than or equal to
//        // value represented by elements of hughInt2.intArray
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < hugeInt1.intArray.length; i++){
//            sum1 += hugeInt1.intArray[i];
//            sum2 += hugeInt1.intArray[i];
//        }
//        return sum1 >= sum2;
//    }
//
//    public static boolean isZero(HugeInteger hugeInt1 ){
//        // return true if the value represented by
//        // elements of hugeInt1.intArray is 0
//        int count = 0;
//        for (int i = 0; i < hugeInt1.intArray.length; i++){
//            if (hugeInt1.intArray[i]==0)
//                count++;
//        }
//
//        return count > 0;
//    }
//
//    public String toString( ){
//        // return string representation of this object
//        return toString();
//    }
//
//    public static void main(String[] args){
//        HugeInteger h = new HugeInteger("abc");
//        HugeInteger h2 = new HugeInteger("xyz");
//        HugeInteger h3 = new HugeInteger();
//        HugeInteger hall = new h3.add(h,h2);
//        boolean b = HugeInteger.isNotEqualTo(h,h2);
//        System.out.println(b);
//        boolean iszero = HugeInteger.isZero(h);
//        System.out.println(iszero);
//        System.out.println(HugeInteger.isEqualTo(h,h2));
//        System.out.println(HugeInteger.isNotEqualTo(h,h2));
//        System.out.println(HugeInteger.isGreaterThan(h,h2));
//        System.out.println(HugeInteger.isGreaterThanOrEqualTo(h,h2));
//        System.out.println(HugeInteger.isLessThan(h,h2));
//
//    }
//}
//
//}