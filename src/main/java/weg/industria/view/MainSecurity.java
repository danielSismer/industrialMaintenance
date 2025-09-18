package weg.industria.view;

import weg.industria.dao.MaquinaDAO;
import weg.industria.dao.PecaDAO;
import weg.industria.dao.TecnicoDAO;
import weg.industria.model.Maquina;
import weg.industria.model.Peca;
import weg.industria.model.Tecnico;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class MainSecurity {

    public static void sendDataMaquina(boolean verified, Maquina maquina) throws SQLException {
        if(verified){
            MaquinaDAO.cadastrarMaquina(maquina);
        } else {
            System.out.println("=========================");
            System.out.println("Falha ao Cadastrar a Máquina, tente novamente\n");

        }
    }

    public static void sendDataTecnico(boolean isUnique, Tecnico tecnico) throws SQLException {
        if(isUnique){
            TecnicoDAO.cadastrarTecnico(tecnico);
        } else {
            System.out.println("=========================");
            System.out.println("Já existe um Técnico com esse nome!!!\nFalha ao Cadastrar Técnico\n");
        }
    }

    // sendDataPeca(isUnique, isMoreThanZero);

    public static void sendDataPeca(boolean isUnique, boolean isMoreThanZero, boolean isNull, Peca peca) throws SQLException {
        if (!isNull) {
            System.out.println("O Nome da peça não pode estar vazio");
            return;
        }

        if (!isUnique) {
            System.out.println("Já existe uma peça com esse nome!");
            return;
        }

        if (!isMoreThanZero) {
            System.out.println("O valor inicial do estoque precisa ser maior que zero!!!");
            return;
        }

        PecaDAO.cadastrarPeca(peca);

    }

}
