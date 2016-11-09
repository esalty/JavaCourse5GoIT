package module2;

/**
 * Created by GodMod on 11/9/2016.
 */
public class CashpointSimulation2_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double fund = 250;
        for (int i=0; i<balances.length;i++)  {
                balances[i] +=fund ;
                System.out.println("\n"+ownerNames[i]+ " " + balances[i]);
            }
        }
    }

