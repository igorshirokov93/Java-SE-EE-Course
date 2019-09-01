package ru.job4j.bank;

import java.util.*;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 04.11.2018
 */

public class Bank {
    private Map<User, ArrayList<Account>> users = new TreeMap<>();

    public Map<User, ArrayList<Account>> getUsers() {
        return this.users;
    }

    /**
     * Add user.
     *
     * @param user user.
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Delete user.
     *
     * @param user user.
     */
    public void deleteUser(User user) {
        this.users.remove(user);
    }

    /**
     * Add account to user.
     *
     * @param passport user passport.
     * @param account  user account.
     */
    public void addAccountToUser(String passport, Account account) {
        User user = this.findUser(passport);
        if (user != null) {
            this.users.get(user).add(account);
        }
    }

    /**
     * Delete account from user.
     *
     * @param passport user passport.
     * @param account  user account.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        User user = this.findUser(passport);
        if (user != null) {
            this.users.get(user).remove(account);
        }
    }

    /**
     * Get user account.
     *
     * @param passport user passport.
     * @return list user accounts.
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> result = new ArrayList<>();
        User user = this.findUser(passport);
        if (user != null) {
            result = this.users.get(user);
        }
        return result;
    }

    /**
     * Transfer amount from srcUser account to destUser account.
     *
     * @param srcPassport  srcUser passport.
     * @param srcRequisite srcUser requisite from account.
     * @param destPassport dstUser passport.
     * @param dstRequisite dstUser requisite from account.
     * @param amount       amount of transfer.
     * @return true if valid transfer else false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Account srcAccount = findAccount(srcPassport, srcRequisite);
        return srcAccount != null
                && srcAccount.transfer(
                findAccount(destPassport, dstRequisite),
                amount
        );
    }

    private Account findAccount(String passport, String requisite) {
        List<Account> accounts = getUserAccounts(passport);
        int index = accounts.indexOf(new Account(0, requisite));
        return index != -1 ? accounts.get(index) : null;
    }

    private User findUser(String passport) {
        User result = null;
        Set<User> keys = this.users.keySet();
        for (User key : keys) {
            if (key != null && key.getPassport().equals(passport)) {
                result = key;
                break;
            }
        }
        return result;
    }
}
