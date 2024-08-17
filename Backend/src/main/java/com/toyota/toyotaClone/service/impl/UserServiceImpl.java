package com.toyota.toyotaClone.service.impl;

import com.toyota.toyotaClone.dto.UserDTO;
import com.toyota.toyotaClone.entity.User;
import com.toyota.toyotaClone.repo.UserRepo;
import com.toyota.toyotaClone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User getUserByUsername(String username) {
        Optional<User> user = userRepo.findByUsername(username);
        if(user.isPresent()){
            return user.get();
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(Integer id) {
        User user = userRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid User ID"+id));

        return user;
    }

    @Override
    public void updateUser(Integer id, User user) {
        //check if user is in database
        userRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid User ID"+id ));

        user.setUserId(id);
        userRepo.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        User user = userRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid User ID"+id ));

        userRepo.delete(user);
    }

    @Override
    public void changePass(Integer id, UserDTO userDTO) {
        User user = userRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid User ID"+id ));

        user.setPassword(userDTO.getPassword());

        userRepo.save(user);
    }
}
