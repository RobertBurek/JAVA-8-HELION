import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args) {

//        TYPY PODSTAWOWE I NIE TYLKO

//        boolean isTrue = false;
//        System.out.println("isTrue = " + isTrue);
//        isTrue = true;
//        System.out.println("isTrue = " + isTrue);
//        byte myByte = 127; // -128 +127
//        System.out.println("myByte = " + myByte);
//        System.out.println("myByte = " + (++myByte));
//        short myShort = 32_767;  // -32,768 +32,767
//        System.out.println("------------------------" );
//        System.out.println("myShort = " + myShort);
//        System.out.println("myShort = " +(++myShort));
//        int myInt = 2_147_483_647 ; // -2,147,483,648 +2,147,483,647
//        System.out.println("myInt = " + myInt);
//        long myLong = 0; // -9.2E+18  +9.2E+18
//        System.out.println("myLong = " + myLong);
////        myInt++;
//        System.out.println("myInt = " + (++myInt));
//        int vv = ++myInt;
//        System.out.println("myInt = " + (vv-2));


//        float myFloat = 1.2f;
//        double myDouble = 1.2d;
//        float a=0.9f;
//        float b=0.3f;
//        System.out.println("a/b = " + a / b);


//        char myChar  = 'A';
//        System.out.println("myChar = " + myChar);
//        String myString = "mój string";
//        System.out.println("myString = " + myString);


//        int a = 5;
//        float b = 2;
//        float c = a + b;
//        System.out.println("c = a + b = " + c);
//        c = a - b;
//        System.out.println("c = a - b = " + c);
//        c = a * b;
//        System.out.println("c = a * b = " + c);
//        c = a / b;
//        System.out.println("c = a / b = " + c);
//        c = a % b;
//        System.out.println("c = a % b = " + c);


//        int d = a++;
//        System.out.println("d = a++ =" + d);
//        System.out.println("a =" + a);
//        d = ++a;
//        System.out.println("d = ++a =" + d);
//        System.out.println("a =" + a);
//        d = a--;
//        System.out.println("d = a-- =" + d);
//        System.out.println("a =" + a);
//        d = --a;
//        System.out.println("d = --a =" + d);
//        System.out.println("a =" + a);
//        a = a+3;
//        System.out.println("a = a + 3 =" + a);
//        System.out.println("a =" + (a+=3));


//        a = 2; //0010
//        System.out.println("a = " + a);
//        a >>= 1; // 0001
//        System.out.println("a = " + a);
////        a >>= 1; // 0000
////        System.out.println("a = " + a);
//        a = a << 3; // 1000
//        System.out.println("a = " + a);


//        int a = 10;
//        System.out.println("a = " + a);
//        a = 0x0A; //0x00_0A
//        System.out.println("a = " + a);
//        a = 0b00001010;
//        System.out.println("a = " + a);
//        a = 0b0000_1010;
//        System.out.println("a = " + a);


        float a = 0.9f;
        float b = 0.3f;
        System.out.println("a/b = " + a / b);
        BigDecimal myA = new BigDecimal("0.9");
        BigDecimal myB = new BigDecimal("0.3");
        System.out.println("myA/myB = " + myA.divide(myB));
        myA = new BigDecimal(0.9f);
        System.out.println("myA = " + myA);
        myA = new BigDecimal(0.9d);
        System.out.println("myA = " + myA);
        myA = new BigDecimal("0.9");
        System.out.println("myA = " + myA);
        BigInteger myBigInt = new BigInteger("122289658556856856856867865800988524545549354845484");
        System.out.println("myBigInt = " + myBigInt);


    }
}