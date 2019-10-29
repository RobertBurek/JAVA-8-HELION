package myPackage;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {

//        WYJĄTKI I STRING (stringBuilder)

////        1) wyjątki
//        int size = -4;
//        try {
//            Square square = new Square(size);
//            System.out.println("squareMetod = " + square.countArea());
//            System.exit(0);
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Niepoprawne dane dla stworzenia obiektu square.");
//        }
//        try {
//            System.out.println("staticMetod = " + countArea(size));
//        } catch (IllegalArgumentException iae) {
////                iae.printStackTrace();
//            System.out.println("Info dla staticMetod: " + iae.getMessage());
////            System.exit(0);
//        } finally {
//            System.out.println("Blok finally"); //wykona się zawsze chyba że System.exit(0);
//        }

////        2) zarządzanie pamięcią
//        System.gc();
////        Stos- Stack - zmienne lokalne (StackOwerFlow),
////        Sterta - Heap - zmienne instacji klas i obiekty.

////        3) STRING - nietypowy obiekt (niemutowalny)
//        String a = "ala";
//        String b = "ala";
//        System.out.println("Porównanie 1 :" + a.equals(b));
//        System.out.println("Porównanie 2 :" + (a == b));
//        String c = new String("ala");
//        System.out.println("Porównanie 3 :" + a.equals(c));
//        System.out.println("Porównanie 4 :" + (a == c));
//
//        String d1 = "ala ma kota";
//        String d2 = "ala" + " ma kota";
//        System.out.println("Porównanie 1 :" + d1.equals(d2));
//        System.out.println("Porównanie 2 :" + (d1 == d2));

//        4) String a StringBuilder
        String sample =stringSample();
        String builderSample =stringBuilderSample();
        System.out.println("-------------------------------");
        System.out.println("Czy są takie same: " +sample.equals(builderSample));


    }

//    4)
    private static String stringBuilderSample() {
        String s = "a";
        long start = System.nanoTime();
        StringBuilder sB = new StringBuilder(s);

        for(int i=0; i<10000; i++) {
            sB.append("a");
        }

        s = sB.toString();
        System.out.println("Time for StringBuilder: "+(System.nanoTime()-start));
        return s;
    }
    private static String stringSample() {
        String s = "a";
        long start = System.nanoTime();
        for(int i=0; i<10000; i++) {
            s = s+"a"; //s = new StringBuilder(s).append("a").toString();
        }
        System.out.println("Time for String: "+(System.nanoTime()-start));
        return s;
    }


//    1)
    public static int countArea(int size) {
//        if (size <= 0) {return 0;}
        if (size <= 0) {
            throw new IllegalArgumentException("Bok musi być dodatni");
        }
        return size * size;
    }
}