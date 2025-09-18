package weg.industria.dao;

import weg.industria.model.Peca;
import weg.industria.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PecaDAO {

    public static void cadastrarPeca(Peca p) throws SQLException {
        String sql = "INSERT INTO Peca (nome, estoque) VALUES (?, ?)";
        try(Connection conn = ConnectionDB.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
        stmt.setString(1, p.getNome());
        stmt.setDouble(2, p.getEstoque());
        stmt.executeUpdate();
            System.out.println("=========================");
            System.out.println("Peça Registrada com sucesso!!!\n");        }
    }

    public static List<Peca> listPeca() {
        String sql = "SELECT id, nome, estoque FROM Peca";
        ArrayList<Peca> pecas = new ArrayList<>();
        try(Connection conn = ConnectionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double estoque = rs.getDouble("estoque");
                pecas.add(new Peca(id, nome, estoque));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pecas;
    }
}