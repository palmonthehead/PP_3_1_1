package com.trofin.springboot.pp_3_1_1.service;



import com.trofin.springboot.pp_3_1_1.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUserById(int id);
    public void deleteUser(int id);
}
