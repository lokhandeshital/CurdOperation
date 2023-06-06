package com.bikkadit.CurdOperation.service.impl;

import com.bikkadit.CurdOperation.model.User;
import com.bikkadit.CurdOperation.repository.UserRepository;
import com.bikkadit.CurdOperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User saveUser = userRepository.save(user);  //clt+alt+v for return
        return saveUser;
    }

    @Override
    public User updateUser(User user, Long userId) {
        User user1 = userRepository.findById(userId).get();

        user1.setUserName(user.getUserName());
        user1.setAddress(user.getAddress());
        user1.setAge(user.getAge());
        user1.setPassword(user.getPassword());

        User updatedUser = userRepository.save(user1);
        return updatedUser;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allUser = userRepository.findAll();
        return allUser;
    }

    @Override
    public void deleteUser(Long userId) {

        User user = userRepository.findById(userId).get();
        userRepository.delete(user);

    }
}
