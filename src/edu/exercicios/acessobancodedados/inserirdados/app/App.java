package edu.exercicios.acessobancodedados.inserirdados.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import edu.exercicios.acessobancodedados.db.DB;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prep = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();

            prep = conn.prepareStatement(
                "INSERT INTO seller" +
                "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                "VALUES (?, ?, ?, ?, ?)"
            );

            prep.setString(1, "Wesley Pereira da Silva");
            prep.setString(2, "wlypereiraa@gmail.com");
            prep.setDate(3, new java.sql.Date(sdf.parse("22/05/1997").getTime()));
            prep.setDouble(4, 2500.00);
            prep.setInt(5, 1);

            prep.execute();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            DB.closeStatement(prep);
            DB.closeConnection();
        }
    }
}
