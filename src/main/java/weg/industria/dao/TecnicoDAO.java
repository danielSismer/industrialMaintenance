package weg.industria.dao;

import weg.industria.model.Tecnico;
import weg.industria.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TecnicoDAO {

    public static void cadastrarTecnico(Tecnico t) throws SQLException {
        String query = "INSERT INTO Tecnico (nome, especialidade)" +
                "VALUES (?, ?)";
        try(Connection conn = ConnectionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, t.getNome());
            stmt.setString(2, t.getEspecialidade());
            stmt.executeUpdate();
            System.out.println("=========================");
            System.out.println("Técnico Cadastrado com sucesso!!!\n");
        }
    }

    public static List<Tecnico> listTecnico() throws SQLException {
        String sql = "SELECT id, nome, especialidade FROM Tecnico";
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        try(Connection conn = ConnectionDB.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String especialidade = rs.getString("especialidade");
                tecnicos.add(new Tecnico(id, nome, especialidade));
            }
        }

        return tecnicos;
    }
}
