package az.edu.turing.module03.lesson33.dao;

import az.edu.turing.module03.lesson33.UserEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostgresUserDao implements UserDao {
    @Override
    public void save(UserEntity userEntity) {
        String sql = "INSERT INTO users ( username, password) VALUES (?, ?)";
        Connection con = null;
        try {con = PostgresConnection.getConnect();
             PreparedStatement stmt = con.prepareStatement(sql) ;
            con.setAutoCommit(false);

            stmt.setString(1, userEntity.getUsername());
            stmt.setString(2, userEntity.getPassword());
            int num=stmt.executeUpdate();
            System.out.println(num);
            System.out.println("User saved");
            con.close();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> userEntities = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection con = PostgresConnection.getConnect();
             ResultSet rs = con.createStatement().executeQuery(sql)) {
            while (rs.next()) userEntities.add( new UserEntity( rs.getLong("id"), rs.getString("username"), rs.getString("password")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userEntities;
    }
}
