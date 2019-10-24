/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args) {

//        Instrukcje sterujące

//        1) IF
//        int number = 3;
//        if (number % 2 == 0) {
//            System.out.println("Liczba = " + number + ", parzysta");
//        } else if (number % 3 == 0) {
//            System.out.println("Liczba = " + number + ", nieparzysta i podzielna przez 3");
//        } else {
//            System.out.println("Liczba = " + number + ", nieparzysta");
//        }


//        2) IF cd
//        int number = 15;
//        if (number % 2 == 0 && number > 0) {
//            System.out.println("Liczba = " + number + ", parzysta i większa od zera");
//        } else if (number % 3 == 0 || number % 5 == 0) {
//            System.out.println("Liczba = " + number + ", nieparzysta i podzielna przez 3 lub 5");
//        } else {
//            System.out.println("Liczba = " + number + ", nieparzysta");
//        }
//        && ||  &  >,<.==,


//        3) equals i equalsIgnoreCase
//        String imie = "ala";
//        if (imie.equals("Ala")) {
//            System.out.println("imie = " + imie);
//        } else if (imie.equalsIgnoreCase("Ala")) {
//            System.out.println("Jednak imie = " + imie);
//        }

//        4) switch
          int monthNumber = 3;
          String monthName = "";
          switch (monthNumber){
              case 1:
                  monthName = "Styczeń";
                  System.out.println("monthName = " + monthName);
                  break;
              case 2:
                  monthName = "Luty";
                  System.out.println("monthName = " + monthName);
                  break;
              case 3:
              case 4:
                  monthName = "Marzec lub Kwiecień";
                  System.out.println("monthName = " + monthName);
                  break;
              default:
                  System.out.println("Nie ma takiego miesiąca");
                  break;
          }
          switch (monthName){
              case "Styczeń":
                  System.out.println("monthNumber = 1");
                  break;
              case "Luty":
                  System.out.println("monthNumber = 2");
                  break;
              case "Marzec lub Kwiecień":
                  System.out.println("monthNumber = 3 lub 4");
                  break;
              default:
                  System.out.println("Inny numer miesiąca");
                  break;
          }



    }

}