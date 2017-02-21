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
    void threeTypeExceptionTrows() throws ExceptionType3, ExceptionType2,ExceptionType1 {

        System.out.println("In treetype methods exception");
        throw new ExceptionType1("Type1 exception");

      //   throw new ExceptionType2("Type2 exception");
      //  throw new ExceptionType3("Type3 exception");
    }


}

