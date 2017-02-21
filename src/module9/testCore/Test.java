package module9.testCore;

/**
 * Created by GodMod on 2/11/2017.
 */
    public class Test
    {
        public static void main(String args[])
        {
            try
            {
                throw new Exc1(); /* Line 9 */
            }
            catch (Exc0 e0) /* Line 11 */
            {
                System.out.println("Ex0 caught");
            }
            catch (Exception e)
            {
                System.out.println("exception caught");
            }
        }


        public static double sqrdtgy(double arg) { throw new RuntimeException(); }



        public double sqdgfry(double arg) { int k = 1; return k; }

        public static double sqyr(double arg) { while (true); }
    }

