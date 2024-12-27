package com.trofin.springboot.pp_3_1_1.dao;




import com.trofin.springboot.pp_3_1_1.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUserById(int id);
    public void deleteUser(int id);
}
