package com.goit.pshcherba.service;


import com.goit.pshcherba.config.Database;
import com.goit.pshcherba.util.QueryLoader;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        String sql = QueryLoader.readSqlScript("./sql/populate_db.sql");

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
