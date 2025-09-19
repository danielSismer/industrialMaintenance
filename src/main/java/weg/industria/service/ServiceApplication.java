package weg.industria.service;

import weg.industria.dao.MaquinaDAO;
import weg.industria.dao.PecaDAO;
import weg.industria.dao.TecnicoDAO;
import weg.industria.main.Main;
import weg.industria.model.Peca;
import weg.industria.model.Tecnico;
import weg.industria.view.MainSecurity;
import weg.industria.view.Security;
import weg.industria.view.UserIF;

import java.sql.SQLException;
import java.util.List;

public class ServiceApplication {

    public static void mainFlux(int option) throws SQLException {
        switch(option){
            case 1 ->{
                var maquina = UserIF.credenciaisMaquina();
                boolean verified = Security.verifyNullMachine(maquina);
                MainSecurity.sendDataMaquina(verified, maquina);
            }
            case 2 ->{
                var tecnico = UserIF.credenciaisTecnico();
                List<Tecnico> tecnicos = TecnicoDAO.listTecnico();
                boolean isUnique = Security.verifyUniqueTechnical(tecnico, tecnicos);
                MainSecurity.sendDataTecnico(isUnique, tecnico);
            }
            case 3 ->{
                var peca = UserIF.credenciaisPeca();
                List<Peca> pecas = PecaDAO.listPeca();
                boolean isUnique = Security.verifyUniquePart(peca, pecas);
                boolean isMoreThanZero = Security.verifyAmount(pecas);
                boolean isNull = Security.verifyNullPart(pecas);
                MainSecurity.sendDataPeca(isUnique, isMoreThanZero,isNull, peca);
            }
            case 4 ->{
            }
        }
    }
}
