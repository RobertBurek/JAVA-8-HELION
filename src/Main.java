import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args) {

//        ZMIENNE, STAŁE I NAZEWNICTWO
//        1)
//        int myInt;
//        myInt = 10;
//        System.out.println("myInt = " + myInt);
//
//        String myString;
//        myString = "mój string";
//        System.out.println("myString = " + myString);
//
//        final int myFinalInt = 11;
////        myFinalInt = 12;  nie można zmienić stałej
//        System.out.println("myFinalInt = " + myFinalInt);


//        2)
//        int intInMain = 30;
//        System.out.println("intInMain (main) = " + intInMain);
//        System.out.println("MAX_NUMBER_OF_STH (main) = " + MAX_NUMBER_OF_STH);
//        System.out.println("maxNumber (main) = " + maxNumber);
//        method();


//        3) Nazewnictwo
//            int zmiennaWMetodzie = 10;


//        4) Rzutowanie na prymitywach
//        int a = 8;
//        int b = 3;
//        int c = a / b;
//        System.out.println("c = " + c);
//        double d = (double) (a / b);
//        System.out.println("d = " + d);
//        double e = a / (double) b;
//        System.out.println("e = " + e);


//        5) Maszyna do kawy V1
        int iloscKaw = 0;

        // pobranie liczby kaw od użytkownika
        System.out.print("Podaj liczbe kaw: ");
        Scanner interfejsUzytkownika = new Scanner(System.in);
        try {
            iloscKaw = interfejsUzytkownika.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Błędne dane!!!");
        }
        System.out.println("Zamówiono " + iloscKaw + " kaw.");

    }


//    2)
//    static final int MAX_NUMBER_OF_STH = 10;
//    static final int maxNumber = 20;
//
//
//    private static void method(){
////        System.out.println("intInMain (main) = " + intInMain);  zmienna lokalna
//        System.out.println("MAX_NUMBER_OF_STH (method) = " + MAX_NUMBER_OF_STH);
//        System.out.println("maxNumber (method) = " + maxNumber);
//
//    }


//    3)
//    static final int NAZWA_STALEJ_NOWA = 10;
//    static int poleStatyczne = 10;
//    int poleKlasy = 10;
//
//    void nazwaMetodyOpisujacaCoRobi(int nazwaArgumentu) {
//        int zmiennaWMetodzie = 10;
//    }

}