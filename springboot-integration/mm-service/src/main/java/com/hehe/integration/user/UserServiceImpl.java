package com.hehe.integration.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User insertUserByName(String name) {
        User user = new User();
        user.setUsername(name);
        user.setPassword("123456");
        return userRepository.save(user);
    }
}