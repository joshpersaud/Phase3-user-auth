package com.dags.handlinguserauthenticationsimplilearn.service;

import com.dags.handlinguserauthenticationsimplilearn.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class UserHardcodedAuthServiceTest {

    @Autowired
    UserHardcodedAuthService userHardcodedAuthService;

    User user;
    User user1;

    @TestConfiguration
    static class UserTestContextConfiguration {
        @Bean
        public UserHardcodedAuthService loginService() {
            return new UserHardcodedAuthService();
        }
    }

    @BeforeEach
    void onStart(){
        user = new User();
        user.setUsername("chris");
        user.setPassword("123");

        user1 = new User();
        user1.setUsername("3235252");
        user1.setPassword("asdgasdgasdg");
    }

    @Test
    void validUserExistsInDatabase() {
        assertTrue(userHardcodedAuthService.userExistsInDatabase(user));
    }

    @Test
    void invalidUserExistsInDatabase() {
        assertFalse(userHardcodedAuthService.userExistsInDatabase(user1));
    }
}