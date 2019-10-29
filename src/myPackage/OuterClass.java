package myPackage;

/**
 * Created by Robert Burek
 */
public class OuterClass {

//    1)
    public class InnerClass {
    }

    public InnerClass instantiate() {
        return new InnerClass();
    }

    public static class StaticInnerClass {
    }

    public static StaticInnerClass staticInnerClass() {
        return new StaticInnerClass();
    }

//    2)
    public String method() {
        class LocalClass {
            String local = "local z klasy lokalnej w metodzie";
        }
        String newLocal = new LocalClass().local;
        return newLocal;
    }

//    3)
    public class Greeting {
        void sayHello() {
        }

        void godBy() {
        }

        int number() {
            return 0;
        }
    }

    public interface I_Greeting {
        void sayHello();

        void goodBy();

        int number();
    }

    public void secondMethod() {
        Greeting greeting = new Greeting();
        I_Greeting i_greeting = new I_Greeting() {
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
