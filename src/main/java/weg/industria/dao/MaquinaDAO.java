package weg.industria.dao;

import weg.industria.model.Maquina;
import weg.industria.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MaquinaDAO {

    public static void cadastrarMaquina (Maquina m) throws SQLException {
        String query = "INSERT INTO Maquina (nome, setor, status)" +
                "VALUES (?, ?, ?)";
        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)){
                stmt.setString(1, m.getNome());
                stmt.setString(2, m.getSetor());
                stmt.setString(3, "OPERACIONAL");
                stmt.executeUpdate();
                System.out.println("=========================");
                System.out.println("Máquina Registrada com sucesso!!!\n");
        }
    }
}
