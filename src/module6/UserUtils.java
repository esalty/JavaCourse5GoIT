package module6;

/**
 * Created by GodMod on 12/12/2016.
 */
public class UserUtils {
    //    Создайте класс UserUtils с последующими методами:

     static User[] uniqueUsers(User[] users) {
        User[] uniqueUsers = new User[users.length];
        int index = 0;
        boolean isUnique = true;
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueUsers[index++] = users[i];
            }
            isUnique = true;
        }
        return deleteEmptyUsers(uniqueUsers);
    }

    static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] usersWithCondBal = new User[users.length];
        int index = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                usersWithCondBal[index++] = user;
            }
        }
        return deleteEmptyUsers(usersWithCondBal);
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
        int counter = 0;
        for (User user : users) {
            if (user == null) {
                counter++;
            }
        }
        User[] nonEmptyUsers = new User[users.length - counter];
        counter = 0;
        for (User user : users) {
            if (user != null) {
                nonEmptyUsers[counter++] = user;
            }
        }
        return nonEmptyUsers;
    }

}
