package module3;

/**
 * Created by GodMod on 11/2/2016.
 */
public class TestModule3 {
    public static void main(String[] args) {
        Bird jackBird = new Bird();
        jackBird.doWalking();
        jackBird.doFlying();
        jackBird.sing();
        jackBird.doAssertion();

        Arithmetic ar = new Arithmetic();

        System.out.println(ar.add(25, -17));

        Adder ad = new Adder();

        System.out.println(ad.check(23456, -123213123));


        User user = new User("John",1500,30,"SoftServe",1000,"$");

        System.out.println("User name:"+user.getName());
        System.out.println("User's balance:"+user.getBalance());
        System.out.println("User's company:"+user.getCompanyName());
        System.out.println("User's months of employment:"+user.getMonthsOfEmployment());
        System.out.println("User's salary:"+user.getSalary());
        System.out.println("User's currency:"+user.getCurrency());
        System.out.println("User's company name length:"+user.companyNameLenght());
        user.monthIncreaser(2);
        user.withdraw(1200);
        System.out.println("User's balance:"+user.getBalance());
        user.paySalary();
        System.out.println("User's months of employment:"+user.getMonthsOfEmployment());
        System.out.println("User's balance:"+user.getBalance());



    }




}
