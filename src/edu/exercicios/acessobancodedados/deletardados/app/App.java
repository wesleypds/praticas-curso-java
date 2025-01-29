package edu.exercicios.acessobancodedados.deletardados.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.exercicios.acessobancodedados.db.DB;
import edu.exercicios.acessobancodedados.db.DbIntegrityException;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prep = null;

        try {
            
            conn = DB.getConnection();

            prep = conn.prepareStatement(
                "DELETE FROM department " +
                "WHERE " +
                "Id = ?"
            );

            prep.setInt(1, 2);

            prep.execute();

        } catch (SQLException e) {
            throw new DbIntegrityException("Error " + e.getMessage());
        }
    }
}
