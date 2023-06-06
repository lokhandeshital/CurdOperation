package com.bikkadit.CurdOperation.service;

import com.bikkadit.CurdOperation.model.User;

import java.util.List;

public interface UserService {

    //create
    public User createUser(User user);

    //update
    public User updateUser(User user,Long userId);

    //get
    public List<User> getAllUser();

    //delete
    public void deleteUser(Long userId);
}
