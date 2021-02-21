package com.dags.handlinguserauthenticationsimplilearn.service;

import com.dags.handlinguserauthenticationsimplilearn.domain.User;
import com.dags.handlinguserauthenticationsimplilearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class UserHardcodedAuthService{

    @Autowired
    UserRepository userRepository;

    public boolean userExistsInDatabase(User user){

        return userRepository.existsByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

}
