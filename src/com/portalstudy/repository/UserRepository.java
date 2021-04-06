package com.portalstudy.repository;

import com.portalstudy.connection.ConnectionFactory;
import com.portalstudy.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {

    public static void save(User user){
        String sql = "INSERT INTO user (user_name, user_password, user_role) VALUES (?, ?, ?)";
        Connection connection = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, user.getUser_name());
            pst.setString(2, user.getUser_password());
            pst.setString(3, user.getUser_role());

            int executedSuccessfully = pst.executeUpdate();
            ConnectionFactory.close(connection, pst);

            if (executedSuccessfully > 0) {
                System.out.println("Created User: "+ user.getUser_name());
                System.out.println(executedSuccessfully);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void update(User user){
        if (user == null || user.getUser_id() == null){
            System.out.println("User not found");
            return;
        }
        String sql = "UPDATE user SET user_name=?, user_password=?, user_role=? WHERE (user_id=?)";

        Connection connection = ConnectionFactory.getConnection();

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, user.getUser_name());
            pst.setString(2, user.getUser_password());
            pst.setString(3, user.getUser_role());
            pst.setString(4, String.valueOf(user.getUser_id()));

            int executedSuccessfully = pst.executeUpdate();
            ConnectionFactory.close(connection, pst);

            if (executedSuccessfully > 0) {
                System.out.println("Updated User: "+ user.getUser_name());
                System.out.println(executedSuccessfully);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
