package edu.exercicios.acessobancodedados.atualizardados.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.exercicios.acessobancodedados.db.DB;

public class App {
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement prep = null;

        try {
            conn = DB.getConnection();

            prep = conn.prepareStatement(
                "UPDATE seller " +
                "SET BaseSalary = BaseSalary + ? " +
                "WHERE " +
                "(Id = ?)"
            );

            prep.setDouble(1, 10000.00);
            prep.setInt(2, 7);

            prep.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            DB.closeStatement(prep);
            DB.closeConnection();
        }
    }
}
