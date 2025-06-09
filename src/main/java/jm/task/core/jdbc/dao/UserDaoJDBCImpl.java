package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS users (" +
//                "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
//                "name VARCHAR(45), " +
//                "lastName VARCHAR(45), " +
//                "age TINYINT)";
//        try (Connection conn = Util.getInstance().getConnection();
//             Statement stmt = conn.createStatement()) {
//            stmt.executeUpdate(sql);
//        } catch (SQLException e) {
//            System.err.println("Error creating users table: " + e.getMessage());
//        }
    }

    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users";
//        try (Connection conn = Util.getInstance().getConnection();
//             Statement stmt = conn.createStatement()) {
//            stmt.executeUpdate(sql);
//        } catch (SQLException e) {
//            System.err.println("Error dropping users table: " + e.getMessage());
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
//        Connection conn = null;
//        try {
//            conn = Util.getInstance().getConnection();
//            conn.setAutoCommit(false); // Начало транзакции
//            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//                pstmt.setString(1, name);
//                pstmt.setString(2, lastName);
//                pstmt.setByte(3, age);
//                pstmt.executeUpdate();
//                conn.commit(); // Фиксация транзакции
//            }
//        } catch (SQLException e) {
//            System.err.println("Error saving user: " + e.getMessage());
//            try {
//                conn.rollback(); // Откат транзакции
//            } catch (SQLException rollbackEx) {
//                System.err.println("Error rolling back transaction: " + rollbackEx.getMessage());
//            }
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.setAutoCommit(true); // Восстановление автокоммита
//                    conn.close(); // Закрытие соединения
//                } catch (SQLException closeEx) {
//                    System.err.println("Error closing connection: " + closeEx.getMessage());
//                }
//            }
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE FROM users WHERE id = ?";
//        try (Connection conn = Util.getInstance().getConnection();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setLong(1, id);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            System.err.println("Error removing user: " + e.getMessage());
//        }
    }

    public List<User> getAllUsers() {
//        String sql = "SELECT * FROM users";
//        List<User> users = new ArrayList<>();
//        try (Connection conn = Util.getInstance().getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//            while (rs.next()) {
//                User user = new User();
//                user.setId(rs.getLong("id"));
//                user.setName(rs.getString("name"));
//                user.setLastName(rs.getString("lastName"));
//                user.setAge(rs.getByte("age"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            System.err.println("Error retrieving users: " + e.getMessage());
//        }
//        return users;
        return null;
    }

    public void cleanUsersTable() {
//        String sql = "TRUNCATE TABLE users";
//        try (Connection conn = Util.getInstance().getConnection();
//             Statement stmt = conn.createStatement()) {
//            stmt.executeUpdate(sql);
//        } catch (SQLException e) {
//            System.err.println("Error cleaning users table: " + e.getMessage());
//        }
//    }
}}
