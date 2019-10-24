/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args) {

//        TABLICE

//        1) tablice jednowymiarowe
        String imie1 = "Ala";
        String imie2 = "Michał";

        String[] tablicaImion1 = new String[10];
        String[] tablicaImion2 = {imie1, imie2, "Robert", "Rafał"};

        System.out.println(tablicaImion2[0]);
        System.out.println(tablicaImion2[1]);
        System.out.println(tablicaImion2[2]);
        System.out.println(tablicaImion2[3]);
        System.out.println("Ilość elementów w tablicyImion2: " + tablicaImion2.length);


//        2) tablice dwuwymiarowe
        int[][] matrix = new int[3][3];
        matrix[1][1] = 2;
        matrix[0][0] = 1;
        matrix[2][2] = 0;

        System.out.println(matrix[0][0] + " " + matrix[1][1] + " " + matrix[2][2]);


    }

}