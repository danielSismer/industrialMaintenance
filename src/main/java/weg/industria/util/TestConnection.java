package weg.industria.util;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

    public static void main (String [] args ){

        try{
            Connection conn = ConnectionDB.getConnection();

            if(conn != null){
                System.out.println("Conexão estabelecida com sucesso!");
                conn.close();
            } else {
                System.out.println("Falha ao estabelecer a conexão.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
