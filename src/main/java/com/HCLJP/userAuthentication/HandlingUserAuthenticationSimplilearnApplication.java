package com.dags.handlinguserauthenticationsimplilearn;

import com.dags.handlinguserauthenticationsimplilearn.domain.User;
import com.dags.handlinguserauthenticationsimplilearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingUserAuthenticationSimplilearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HandlingUserAuthenticationSimplilearnApplication.class, args);
    }


    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setUsername("chris");
        user.setPassword("123");

        User user1 = new User();
        user1.setUsername("John");
        user1.setPassword("321");

        userRepository.save(user);
        userRepository.save(user1);
    }
}
