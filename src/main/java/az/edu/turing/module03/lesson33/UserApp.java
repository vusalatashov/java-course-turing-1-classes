package az.edu.turing.module03.lesson33;

import az.edu.turing.module03.lesson33.dao.PostgresUserDao;
import az.edu.turing.module03.lesson33.dao.UserDao;

public class UserApp {
    public static void main(String[] args) {
       UserEntity userEntity1 = new UserEntity(6, "Ibrahim", "FaxiSus");
       UserEntity userEntity2 = new UserEntity(4, "Revan", "FaxiSus");
         UserDao userDao = new PostgresUserDao();
//         userDao.save(userEntity1);
//         userDao.save(userEntity2);
        System.out.println(userDao.findAll());

    }
}
