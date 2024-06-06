package com.obstacle.backend.service;

import com.obstacle.backend.model.User;
import com.obstacle.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User saveUser(User user) {

        return (User) userRepository.save(user);
    }

    public User findByUsername(String username) {
        return (User) userRepository.findByUsername(username);
    }
}
