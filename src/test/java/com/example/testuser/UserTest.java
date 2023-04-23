package com.example.testuser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    //    private static String login = null;
    //    private static String email = null;
    private static String email = "user@gmail.ru";
    private static String login = "qwerty";


    private final User userTest = new User(email, login);

    @Test
    @DisplayName("Тестирование создания объекта User с передачей в него двух параметров")
    void shouldValidationTwoUserParameters() {
        Assertions.assertTrue(User.validationTwoUserParameters(userTest));
    }

    @Test
    @DisplayName("Тестирование по созданию объекта User без передачи в него параметров")
    void shouldValidationWithoutUserParameters() {
        Assertions.assertTrue(User.validationWithoutUserParameters(userTest));
    }

    @Test
    @DisplayName("Тестирование корректного Email адрес в поле email в классе User")
    void shouldValidationEmailDogAt() {
        Assertions.assertTrue(User.validationEmailDogAt(userTest));
    }

    @Test
    @DisplayName("Тест, который определяет, равны ли login и email")
    void shouldEqualsEmailAndLogin() {
        Assertions.assertFalse(User.equalsEmailAndLogin(userTest));
    }
}