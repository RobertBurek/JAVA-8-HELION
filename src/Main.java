import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {

////    3) Pola statyczne i niestatyczne
//    static int staticField;
//    int nonStaticfIELD;
//
////    4) Zasięg zmiennych i metod
////    static void staticMethod() {
////        System.out.println("staticField = " + staticField);
////        int staticMethodField = 0;
////    }
////    void method() {
////        //System.out.println("nonstaticField = " + nonStaticField);
////        System.out.println("staticField = " + staticField);
////        int methodField = 0;
////    }

    public static void main(String[] args) {

//        KLASA  Rectangle  i OBIEKT (metody i pola)

//        Rectangle rectangle1 = new Rectangle(10, 20);
//        Rectangle rectangle2 = new Rectangle(30, 15);
//
//        System.out.println("rectangle1.perimeter = " + rectangle1.perimeter());
//        System.out.println("rectangle2.perimeter = " + rectangle2.perimeter());
//        System.out.println("rectangle1.area = " + rectangle1.area());
//        System.out.println("rectangle2.area = " + rectangle2.area());

////        1) METODY
//        System.out.println("a+b = " + sum(3, 6));
//        System.out.println("a+b = " + sum(5.0, 12.0));

////        2) POLA w klasie
//        Rectangle rectangle = new Rectangle(10, 20);
//        System.out.println(Rectangle.MAX_HEIGHT);
//        System.out.println(Rectangle.MAX_WIDTH);
//        rectangle.width = 100;
//        rectangle.height = 200;
//        Rectangle.staticMethod();
//        rectangle.classMethod();

////        3) Pola statyczne i niestatyczne
//        System.out.println("staticField : " + staticField);
//        //System.out.println("nonStaticField : " + nonStaticField);


////        4) Zasięg zmiennych i metod
//        boolean mainMethodField = true;
//        int secondMainMethodField = 0;
//        for (int i = 0; i < 10; i++) {
//            i++;
//            System.out.println("secondMainMethodField = " + secondMainMethodField);
//            int fieldInFor = 0;
//            System.out.println("fieldInFor = " + fieldInFor);
//        }
//         //System.out.println("fieldInFor = " + fieldInFor);  // zmienna nie ma zasięgu
//        if (mainMethodField) {
//            System.out.println("secondMainMethodField = " + secondMainMethodField);
//            System.out.println("staticField = " + staticField);
//        }

//        5) Maszyna do kawy cd..

        Scanner interfejsUzytkownika = new Scanner(System.in);
        String typKawy = getTypKawy(interfejsUzytkownika);
        if (typKawy.equalsIgnoreCase(BIALA_KAWA) || typKawy.equalsIgnoreCase(CZARNA_KAWA)) {
            getLiczbaKaw(interfejsUzytkownika, typKawy);
        } else {
            System.out.println("Brak podanego typu kawy");
        }
    }

    static final String BIALA_KAWA = "B";
    static final String CZARNA_KAWA = "C";
    static final int ILOSC_PROB = 3;

    static void getLiczbaKaw(Scanner interfejsUzytkownika, String typKawy) {
        int iloscKaw = 0;
        int proba = 0;
        do {
            System.out.print("Podaj liczbe kaw: ");
            try {
                proba++;
                iloscKaw = interfejsUzytkownika.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Błędne dane!!!");
            }
            pokazZamowienie(iloscKaw, typKawy);
        } while (proba < ILOSC_PROB && iloscKaw <= 0);
    }

    static void pokazZamowienie(final int iloscKaw, final String typKawy) {
        System.out.print("Zamówiono " + iloscKaw);
        if (typKawy.equalsIgnoreCase(BIALA_KAWA)) {
            System.out.println(" kaw z mlekiem");
        } else if (typKawy.equalsIgnoreCase(CZARNA_KAWA)) {
            System.out.println(" kaw czarnych");
        }
        System.out.println("Pamiętaj o cukrze!");
    }

    //    5) Maszyna do kawy
    static String getTypKawy(Scanner interfejsUzytkownika) {
        System.out.print("Kawa: [B] - z mlekiem ,  [C] - czarna : ");
        return interfejsUzytkownika.next();
    }

////    1) Metody
//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static double sum(double a, double b) {
//        return a + b;
//    }
}