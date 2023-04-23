package com.example.testuser;

import java.util.Objects;

public class User {
    private String email;
    private String login;

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }

    public static boolean validationTwoUserParameters (User user) {
        return !user.getEmail().isBlank() && !user.getLogin().isBlank();
    }

    public static boolean validationWithoutUserParameters(User user) {
        return user.getEmail() == null && user.getLogin() == null;
    }

    public static boolean validationEmailDogAt(User user) {
        return user.getEmail().contains("@") && user.getEmail().contains(".");
    }

    public static boolean equalsEmailAndLogin(User user) {
        return user.getEmail().equals(user.getLogin());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, login);
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }
}
