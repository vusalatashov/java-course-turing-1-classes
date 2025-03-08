package az.edu.turing.module03.lesson33.dao;

import az.edu.turing.module03.lesson33.UserEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostgresUserDao implements UserDao {
    @Override
    public void save(UserEntity userEntity) {
        String sql = "INSERT INTO users ( username, password) VALUES (?, ?)";
        try (Connection con = PostgresConnection.getConnect();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, userEntity.getUsername());
            stmt.setString(2, userEntity.getPassword());
            int num=stmt.executeUpdate();
            System.out.println(num);
            System.out.println("User saved");
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> userEntities = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection con = PostgresConnection.getConnect();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                long id = rs.getLong("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                UserEntity userEntity = new UserEntity(id, username, password);
                userEntities.add(userEntity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userEntities;
    }
}
