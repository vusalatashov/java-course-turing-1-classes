package az.edu.turing.module03.lesson33.dao;

import az.edu.turing.module03.lesson33.UserEntity;

import java.util.List;

public interface UserDao {

    void save(UserEntity userEntity);

    List<UserEntity> findAll();
}
