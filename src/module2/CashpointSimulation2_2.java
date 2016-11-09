package module2;
/**
 * Created by GodMod on 11/9/2016.
 */
public class CashpointSimulation2_2 {
    public static void main(String[] args) {
        double balance = 1000.0;
        double commission = 5.0;
        double sumToWithdraw = 900;
        double totalSumToWithdraw = sumToWithdraw + sumToWithdraw * (0.01 * commission);
        if (balance>=totalSumToWithdraw){
            balance -=totalSumToWithdraw ;
            System.out.println("OK" + " " + commission + " " + balance);
        }else
            System.out.println("No");







    }


}
