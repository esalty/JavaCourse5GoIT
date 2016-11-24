package module4;

/**
 * Created by GodMod on 11/23/2016.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {

        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100;
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() >= amount) {
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userFromBank = fromUser.getBank();
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        fundUser(user, user.getSalary());
    }
}
