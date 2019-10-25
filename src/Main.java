import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args) {

//        PĘTLE

//        1) FOR
//        for(int i=0 ; i<=10 ; i+=2){
//            System.out.println("i = " + i);
//        }
//        int[] array = {1,4,2,3,6,9};
//        for (int i=0;i<array.length;i++) {
//            System.out.println("i = " + i + ", value = "+ array[i]);
//        }

//        2) FOREACH
//        int[] array = {1,4,2,3,6,9,0,5,8,7};
//        for(int value : array){
//            System.out.println("value = " + value);
//        }

//        3) Sortowanie bombelkowe
//        int[] array = {1, 4, 2, 3, 6, 9, 0, 5, 8, 7};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < (array.length - i); j++) {
//                if (array[j - 1] > array[j]) {
//                    int temp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = temp;
//                }
//            }
//            System.out.print("iteracja " + i + ", array: ");
//            for (int value : array) {
//                System.out.print(value + ", ");
//            }
//            System.out.println();
//        }

//        4) WHILE()
//        int[] array = {1, 4, 2, 3, 6, 9, 0, 5, 8, 7};
//        int i=0;
//        while(i<array.length){
//            System.out.println("array["+i+"] = "+array[i]);
//            i++;
//        }

//        5) DO WHILE()
//        int[] array = {1, 4, 2, 3, 6, 9, 0, 5, 8, 7};
//        int i = 0;
//        do {
//            System.out.println("array[" + i + "] = " + array[i]);
//            i++;
//        } while (i < array.length);

//        6) Przerywanie pętli BREAK
//      int[] array = {1, 4, 2, 3, 6, 9, 0, 5, 8, 7};
//      int i = 0;
//          do {
//          System.out.println("array[" + i + "] = " + array[i]);
//          i++;
//          if (i==5) break;
//      } while (i < array.length);


//        7) CONTINUE
//        int[] array = {1, 4, 2, 3, 6, 9, 0, 5, 8, 7};
//        for(int i = 0; i<array.length; i++){
//            System.out.println("array[" + i + "] = " + array[i]);
//            if (array[i]%2==0) continue;
//            System.out.println("     powyżej jest nieparzysta");
//        }

//        8) Etykieta
//        int[] numbers = {1, 4, 2, 3, 6, 9, 0, 5, 8, 7};
//        etykieta:
//        for (int j = 0; j < 10; j++) {
//            https://robertburek.pl
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.println("numbers[" + i + "] = " + numbers[i]);
//                numbers[i]++;
//                if (numbers[i] > 6) break etykieta;
//            }
//            System.out.println("Pętla zewnetrza");
//        }

//        8) Maszyna do kawy cd..
        int iloscKaw = 0;
        int proba = 0;
        System.out.print("Kawa: [B] - z mlekiem ,  [C] - czarna : ");
        Scanner interfejsUzytkownika = new Scanner(System.in);
        String typKawy = interfejsUzytkownika.next();
        if (typKawy.equalsIgnoreCase("b") || typKawy.equalsIgnoreCase("c")) {
            do {
                System.out.print("Podaj liczbe kaw: ");
                try {
                    proba++;
                    iloscKaw = interfejsUzytkownika.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Błędne dane!!!");
                }
                System.out.print("Zamówiono " + iloscKaw + " ");
                switch (typKawy) {
                    case "B":
                    case "b":
                        System.out.println("kaw z mlekiem");
                        break;
                    case "C":
                    case "c":
                        System.out.println("kaw czarnych");
                        break;
                }
            } while (proba < 3 && iloscKaw <= 0);
        } else {
            System.out.println("Brak podanego typu kawy");
        }
    }


    private static void swapElements(int[] array, int j) {
        int temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }
}