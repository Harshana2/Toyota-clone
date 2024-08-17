package com.toyota.toyotaClone.service;

import com.toyota.toyotaClone.dto.UserDTO;
import com.toyota.toyotaClone.entity.User;

import java.util.List;

public interface UserService {
    User getUserByUsername(String username);


    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void changePass(Integer id, UserDTO userDTO);
}
