package module10;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by GodMod on 2/3/2017.
 */
public class TestException {
    public static void main(String[] args) throws MyException, OurException {
        try {
            throw new Exception("ololo");
            //System.out.println("Test");

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("EGEG");

        try {
            throw new MyException("Ouou");
        } catch (MyException e) {
            System.out.println(e.getMassegeException());

        }

        System.out.println("After catch MyException");
        Object testEx = null;
        try {
            testEx.hashCode();
        } catch (NullPointerException e) {
            System.out.println("We catch null pointer exception");
        }
        System.out.println(testEx);


       ClassWithFndG cls= new ClassWithFndG();
        cls.f();


    }

}
