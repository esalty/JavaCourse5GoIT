package module10;

/**
 * Created by GodMod on 2/9/2017.
 */
public class ClassWithFndG {
    void f() {

            g();
           }

    void g() {
        try {
            throw new Exception("Exception great message");
        } catch (Exception e) {
            System.out.println("In G");        }
        try {
            throw new OurException("OurExc");
        } catch (OurException e) {
            System.out.println(e.getMassegeException());
        }
    }
}

