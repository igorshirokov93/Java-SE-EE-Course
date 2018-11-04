package ru.job4j.bank;

import java.util.Objects;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 04.11.2018
 */

public class User implements Comparable<User> {
    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return this.name;
    }

    public String getPassport() {
        return this.passport;
    }

    @Override
    public int compareTo(User o) {
        final int result = this.name.compareTo(o.getName());
        return result != 0 ? result : this.passport.compareTo(o.getPassport());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.name, user.name)
                && Objects.equals(this.passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
} 