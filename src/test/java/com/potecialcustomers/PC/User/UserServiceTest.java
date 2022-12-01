package com.potecialcustomers.PC.User;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    public UserService userService;

    /*
     * 1# Check User
     */

    @ParameterizedTest
    @MethodSource("userGenerator")
    void checkUser(UserModel checkUser) {
        boolean CorrectlySaved = userService.userSave(checkUser);

        // assertTrue(CorrectlySaved);
    }

    /* Base de Datos */
    private static Stream<Arguments> userGenerator() {
        return Stream.of(
                Arguments.of(new UserModel(1, "root", "root")),
                Arguments.of(new UserModel(2, "cliente1", "")));

    }
}
