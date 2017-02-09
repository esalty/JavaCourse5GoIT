package module10;

/**
 * Created by GodMod on 2/3/2017.
 */
public class TestException {
    public static void main(String[] args) {
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

    }
}
