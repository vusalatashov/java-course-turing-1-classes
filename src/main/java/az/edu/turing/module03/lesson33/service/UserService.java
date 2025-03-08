package az.edu.turing.module03.lesson33.service;

import az.edu.turing.module03.lesson33.UserEntity;
import az.edu.turing.module03.lesson33.dao.PostgresUserDao;
import az.edu.turing.module03.lesson33.dao.UserDao;

import java.util.List;


public class UserService {
    UserDao postgresUserDao ;

    public UserService() {
        postgresUserDao = new PostgresUserDao();
    }

    public void save(UserEntity userEntity) {
        postgresUserDao.save(userEntity);
    }

    public List<UserEntity> findAll() {
        return postgresUserDao.findAll();
    }
}
