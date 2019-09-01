package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 04.11.2018
 */

public class BankTest {
    /**
     * Test addUser.
     */
    @Test
    public void whenAddUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Igor", "4111 500000"));
        assertThat(bank.getUsers().size(), is(1));
    }

    /**
     * Test deleteUser.
     */
    @Test
    public void whenDeleteUser() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        bank.addUser(user);
        bank.deleteUser(user);
        assertThat(bank.getUsers().isEmpty(), is(true));
    }

    /**
     * Test addAccountToUser
     */
    @Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        bank.addUser(user);
        bank.addAccountToUser("4111 500000", new Account(0, "2810987720000540"));
        assertThat(bank.getUsers().get(user).size(), is(1));
    }

    /**
     * Test deleteAccountFromUser.
     */
    @Test
    public void whenDeleteAccountFromUser() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        bank.addUser(user);
        Account account = new Account(0, "2810987720000540");
        bank.addAccountToUser(user.getPassport(), account);
        bank.deleteAccountFromUser(user.getPassport(), account);
        assertThat(bank.getUsers().get(user).isEmpty(), is(true));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenTransferMoney() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        User secondUser = new User("Nick", "4153 000012");
        bank.addUser(user);
        bank.addUser(secondUser);
        Account account = new Account(500, "2810987720000540");
        Account accountNick = new Account(300, "1027739460737354");
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(secondUser.getPassport(), accountNick);
        boolean rst = bank.transferMoney(
                user.getPassport(),
                account.getRequisites(),
                secondUser.getPassport(),
                accountNick.getRequisites(),
                400
        );
        assertThat(rst, is(true));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenInvalidAmount() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        User secondUser = new User("Nick", "4153 000012");
        bank.addUser(user);
        bank.addUser(secondUser);
        Account account = new Account(500, "2810987720000540");
        Account accountNick = new Account(300, "1027739460737354");
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(secondUser.getPassport(), accountNick);
        boolean rst = bank.transferMoney(
                user.getPassport(),
                account.getRequisites(),
                secondUser.getPassport(),
                accountNick.getRequisites(),
                600
        );
        assertThat(rst, is(false));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenInvalidSrcAccount() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        User secondUser = new User("Nick", "4153 000012");
        bank.addUser(user);
        bank.addUser(secondUser);
        Account account = new Account(500, "2810987720000540");
        Account accountNick = new Account(300, "1027739460737354");
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(secondUser.getPassport(), accountNick);
        boolean rst = bank.transferMoney(
                user.getPassport(),
                "2810987720000541",
                secondUser.getPassport(),
                accountNick.getRequisites(),
                400
        );
        assertThat(rst, is(false));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenInvalidDestAccount() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        User secondUser = new User("Nick", "4153 000012");
        bank.addUser(user);
        bank.addUser(secondUser);
        Account account = new Account(500, "2810987720000540");
        Account accountNick = new Account(300, "1027739460737354");
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(secondUser.getPassport(), accountNick);
        boolean rst = bank.transferMoney(
                user.getPassport(),
                "2810987720000540",
                secondUser.getPassport(),
                "1027739460737355",
                400
        );
        assertThat(rst, is(false));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenInvalidSrcPassportAmount() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        User secondUser = new User("Nick", "4153 000012");
        bank.addUser(user);
        bank.addUser(secondUser);
        Account account = new Account(500, "2810987720000540");
        Account accountNick = new Account(300, "1027739460737354");
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(secondUser.getPassport(), accountNick);
        boolean rst = bank.transferMoney(
                "4153 000012",
                account.getRequisites(),
                secondUser.getPassport(),
                accountNick.getRequisites(),
                200
        );
        assertThat(rst, is(false));
    }

    /**
     * Test transferMoney.
     */
    @Test
    public void whenInvalidDestPassportAmount() {
        Bank bank = new Bank();
        User user = new User("Igor", "4111 500000");
        User secondUser = new User("Nick", "4153 000012");
        bank.addUser(user);
        bank.addUser(secondUser);
        Account account = new Account(500, "2810987720000540");
        Account accountNick = new Account(300, "1027739460737354");
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(secondUser.getPassport(), accountNick);
        boolean rst = bank.transferMoney(
                user.getPassport(),
                account.getRequisites(),
                "4153 000010",
                accountNick.getRequisites(),
                200
        );
        assertThat(rst, is(false));
    }
} 