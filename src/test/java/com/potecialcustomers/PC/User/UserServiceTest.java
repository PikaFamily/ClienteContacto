package com.potecialcustomers.PC.User;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UserServiceTest {

    static UserService userService;

    @BeforeAll
    public static void setup() {
        userService = new UserService();
    }

    /*
     * 1# Check User
     */

    @ParameterizedTest
    @MethodSource("userGenerator")
    void checkUser(UserModel checkUser) {
        boolean CorrectlySaved = userService.checkUser(checkUser.getUsername(), checkUser.getUsername());

        assertTrue(CorrectlySaved);
    }

    /* Base de Datos */
    private static Stream<Arguments> userGenerator() {
        return Stream.of(
                Arguments.of(new UserModel(1, "root", "root")),
                Arguments.of(new UserModel(2, "cliente1", "")));

    }
}
