package module6;

/**
 * Created by GodMod on 12/12/2016.
 */
public class UserUtils {
    //    Создайте класс UserUtils с последующими методами:


    static User[] uniqueUsers(User[] users) {

        return users;
    }
    //users совпадают, когда все их поля совпадают


    static User[] usersWithContitionalBalance(User[] users, int balance) {
        return users;
    }


    //user’s balance == balance
    static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;

    }

    static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
        //return new long[users.length];
    }


    static User[] deleteEmptyUsers(User[] users) {
        return users;
    }

}
