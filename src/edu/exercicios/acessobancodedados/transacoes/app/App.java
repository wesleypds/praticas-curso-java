package edu.exercicios.acessobancodedados.transacoes.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import edu.exercicios.acessobancodedados.db.DB;
import edu.exercicios.acessobancodedados.db.DbException;

public class App {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            con = DB.getConnection();
            st = con.createStatement();

            con.setAutoCommit(false);

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 1050 WHERE DepartmentId = 1");

            // int x = 1;
            // if (x < 2) {
            //     throw new SQLException("FAKE ERROR");
            // }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3050 WHERE DepartmentId = 2");

            con.commit();

            System.err.println("Rows1 afetadas: " + rows1);
            System.err.println("Rows2 afetadas: " + rows2);
        } catch (SQLException e) {
            try {
                con.rollback();
                throw new DbException("Transação não concluida! Causada por: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Erro para realizar o Rollback! Causada por: " + e1.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
