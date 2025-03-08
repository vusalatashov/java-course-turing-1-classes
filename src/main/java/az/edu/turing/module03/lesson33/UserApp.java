package az.edu.turing.module03.lesson33;

import az.edu.turing.module03.lesson33.controller.UserController;
import az.edu.turing.module03.lesson33.dao.PostgresUserDao;
import az.edu.turing.module03.lesson33.dao.UserDao;

public class UserApp {
    public static void main(String[] args) {
       UserEntity userEntity1 = new UserEntity(6, "Ibrahim", "FaxiSus");
       UserEntity userEntity2 = new UserEntity(4, "Revan", "FaxiSus");
         UserController userController = new UserController();
         userController.save(userEntity1);
         userController.save(userEntity2);
        System.out.println(userController.findAll());

    }
}
