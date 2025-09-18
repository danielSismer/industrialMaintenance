package weg.industria.view;

import weg.industria.dao.PecaDAO;
import weg.industria.dao.TecnicoDAO;
import weg.industria.model.Maquina;
import weg.industria.model.Peca;
import weg.industria.model.Tecnico;

import java.sql.SQLException;
import java.util.List;

public class Security {

    public static boolean verifyNullMachine(Maquina maquina) {
        boolean verified = true;
        if (maquina.getNome().isEmpty()) {
            System.out.println("O nome da Máquina não pode estar Vazio!!!");
            verified = false;
        }

        if (maquina.getSetor().isEmpty()){
            System.out.println("O setor da Máquina não pode estar Vazio!!!");
            verified = false;
        }

        return verified;
    }

    public static boolean verifyUniqueTechnical(Tecnico tecnico, List<Tecnico> tecnicoList) throws SQLException {

        boolean isUnique = true;
        for(Tecnico t : tecnicoList){
            if (t.getNome().equalsIgnoreCase(tecnico.getNome())) {
                isUnique = false;
                break;
            }
        }

        return isUnique;
    }

    public static boolean verifyUniquePart(Peca peca, List<Peca> pecas){
        boolean isUnique = true;
        for(Peca p : pecas ){
            if (p.getNome().equalsIgnoreCase(peca.getNome())) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }

    public static boolean verifyAmount (List<Peca> pecas){
        boolean verified = true;
        for(Peca p : pecas){
            if(p.getEstoque() < 0 ){
                verified = false;
                break;
            }
        }
        return verified;
    }

    public static boolean verifyNullPart(List<Peca> peca){
        boolean isNull = true;
        for(Peca p : peca){
            if (p.getNome().trim().isEmpty()) {
                isNull = false;
                break;
            }
        }

        return isNull;
    }
}

