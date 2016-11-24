package module4;

/**
 * Created by GodMod on 11/23/2016.
 */
public interface BankSystem      {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
