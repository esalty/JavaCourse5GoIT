package module3;

/**
 * Created by GodMod on 11/2/2016.
 */
public class TestModule3 {
    public static void main(String[] args) {
        Bird jackBird = new Bird();
        jackBird.doWalking();
        jackBird.doFlying();
        jackBird.Sing();
        jackBird.doAssertion();

        Arithmetic ar = new Arithmetic();

        System.out.println(ar.add(25, -17));

        Adder ad = new Adder();

        System.out.println(ad.check(23456, -123213123));
    }


}
