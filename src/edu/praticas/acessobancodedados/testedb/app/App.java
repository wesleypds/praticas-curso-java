package edu.praticas.acessobancodedados.testedb.app;

import java.sql.Connection;

import edu.praticas.acessobancodedados.db.DB;

public class App {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();

        if (conn != null) {
            System.err.println("Conexão bem sucedida!");
            DB.closeConnection();
            System.err.println("Conexão Fechada!");
        } else {
            System.out.println("Falha na conexão!");
        }
    }
}
