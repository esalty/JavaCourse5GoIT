package module4;

import static module4.Bank.Currency.EURO;
import static module4.Bank.Currency.USD;

/**
 * Created by GodMod on 11/23/2016.
 */
public class Main {

    public static void main(String[] args) {
        Bank usBank = new USBank(132132, "USA", USD, 7000, 4.800, 5, 600000000);
        Bank euroBank = new EUBank(24342432, "France", EURO, 3500, 3.200, 4, 40000000);
        Bank chinaBank = new ChinaBank(75675656, "China", USD, 3435, 1500.43, 65, 766776767);
        User usBankUser1 = new User("John", 3000, 1500, usBank);
        User usBankUser2 = new User("Alice", 2500, 2000, euroBank);
        User chinaBankUser1 = new User("LinHo", 800, 400, chinaBank);
        User chinaBankUser2 = new User("Terry", 400, 7000, usBank);
        User euBankUser1 = new User("Lara", 1500, 1200, euroBank);
        User euBankUser2 = new User("VanChan", 500, 600, chinaBank);
        System.out.println(usBankUser1);
        System.out.println(usBankUser2);
        System.out.println(euBankUser1);
        System.out.println(euBankUser2);
        System.out.println(chinaBankUser1);
        System.out.println(chinaBankUser2);
    }
}
