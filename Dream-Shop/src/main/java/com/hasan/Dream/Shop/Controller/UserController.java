package com.hasan.Dream.Shop.Controller;

import com.hasan.Dream.Shop.Model.User;
import com.hasan.Dream.Shop.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) throws Exception{

        User isExist =userRepository.findByEmail(user.getEmail());
        if (isExist!=null){
            throw new Exception("Email is already used"+ user.getEmail());
        }

        User savedUser =userRepository.save(user);
        return savedUser;
    }

}
