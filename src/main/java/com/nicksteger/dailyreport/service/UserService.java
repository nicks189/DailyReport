package com.nicksteger.dailyreport.service;

import com.nicksteger.dailyreport.data.entity.User;
import com.nicksteger.dailyreport.data.repository.UserRepository;
import com.nicksteger.dailyreport.rest.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        // Convert iterable to list
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUserByID(long id) {
        return userRepository.findById(id);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User getUserBySmsNumber(String number) {
        return userRepository.findBySmsNumber(number);
    }

    public User getUserByTwitterHandle(String handle) {
        return userRepository.findByTwitterHandle(handle);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User fromUserDTO(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setSmsNumber(userDTO.getSmsNumber());
        user.setTwitterHandle(userDTO.getTwitterHandle());
        return user;
    }

    public User saveUserDTO(UserDTO userDTO) {
        return saveUser(fromUserDTO(userDTO));
    }

}
