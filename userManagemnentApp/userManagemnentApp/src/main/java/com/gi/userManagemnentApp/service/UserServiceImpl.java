package com.gi.userManagemnentApp.service;

import com.gi.userManagemnentApp.dto.User;
import com.gi.userManagemnentApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
    @Override
    public User getUser(String id) {
        return userRepository.getUser(id);
    }

    @Override
    public void addUser(User user) {
      userRepository.addUser(user);
    }

    @Override
    public User updateUser(User user) {

        return userRepository.updateUser(user);
    }

    @Override
    public User deleteUser(String id) {
        return userRepository.deleteUser(id);
    }
}
