package com.dags.handlinguserauthenticationsimplilearn.controller;

import com.dags.handlinguserauthenticationsimplilearn.domain.User;
import com.dags.handlinguserauthenticationsimplilearn.service.UserHardcodedAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserHardcodedAuthService userHardcodedAuthService;

    @PostMapping
    public ResponseEntity login(@RequestBody User user){

        if(userHardcodedAuthService.userExistsInDatabase(user)){
            return ResponseEntity.status(HttpStatus.OK).build();
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
