package ru.job4j.bank;

import java.util.Objects;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 04.11.2018
 */

public class Account {
    private double value;
    private String requisites;

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return this.value;
    }

    public String getRequisites() {
        return this.requisites;
    }

    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Transfer to destAccount.
     *
     * @param destAccount account.
     * @param amount      amount of transfer.
     * @return true if valid transfer else false.
     */
    public boolean transfer(Account destAccount, double amount) {
        boolean result = false;
        if (amount > 0 && this.value >= amount && destAccount != null) {
            result = true;
            this.value -= amount;
            destAccount.setValue(destAccount.getValue() + amount);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisites, account.requisites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisites);
    }
} 