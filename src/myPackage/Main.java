package myPackage;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {

////        KLASY WEWNĘTRZNE I ANONIMOWE
//
////        1) Klasa wewnętrzna i statyczna klasa wewnętrzna
//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        OuterClass.InnerClass innerClass2 = outerClass.instantiate();
//
//        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
//        OuterClass.StaticInnerClass staticInnerClass2 = OuterClass.staticInnerClass();

////        2) Klasa lokalna w metodzie
//        OuterClass outerClass2 = new OuterClass();
//        String localField = outerClass2.method();
//        System.out.println("localField = " + localField);

//        3) Klasy anonimowe
        OuterClass pomocnicza = new OuterClass();
        OuterClass.Greeting greeting = pomocnicza.new Greeting();

        OuterClass.I_Greeting i_greeting = new OuterClass.I_Greeting() {
            @Override
            public void sayHello() {

            }

            @Override
            public void goodBy() {

            }

            @Override
            public int number() {
                return 0;
            }
        };
    }

}