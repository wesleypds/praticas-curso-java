package edu.exercicios.acessobancodedados.demorecuperardados.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.exercicios.acessobancodedados.db.DB;
import edu.exercicios.acessobancodedados.demorecuperardados.models.Department;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet result = null;

        try {
            List<Department> list = new ArrayList<>();

            conn = DB.getConnection();

            st = conn.createStatement();

            result = st.executeQuery("select * from department");

            while (result.next()) {
                list.add(new Department(result.getInt("Id"), result.getString("Name")));
            }

            list.forEach(System.out::println);
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(result);
            DB.closeConnection();
        }
    }
}
