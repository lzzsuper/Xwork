package com.x.xwork.service;

import com.x.xwork.entity.User;
import com.x.xwork.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 获取所有用户
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 根据用户名查询用户
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // 根据ID查询用户
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
