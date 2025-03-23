package az.edu.turing.module03.lesson33.controller;

import az.edu.turing.module03.lesson33.UserEntity;
import az.edu.turing.module03.lesson33.service.UserService;

import java.util.List;

public class UserController {
    UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public void save(UserEntity userEntity) {
        userService.save(userEntity);
    }

    public List<UserEntity> findAll() {
        return userService.findAll();
    }

}
