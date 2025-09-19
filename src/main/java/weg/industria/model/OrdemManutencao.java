package weg.industria.model;

import weg.industria.dao.TecnicoDAO;

import java.sql.Date;

public class OrdemManutencao {

    private int id;
    private Maquina maquinaID;
    private Tecnico tecnicoID;
    private Date dataSolicitacao;
    private String statusOrdemManutencao;

    public OrdemManutencao(int id, Maquina maquinaID, Tecnico tecnicoID, Date dataSolicitacao, String statusOrdemManutencao) {
        this.id = id;
        this.maquinaID = maquinaID;
        this.tecnicoID = tecnicoID;
        this.dataSolicitacao = dataSolicitacao;
        this.statusOrdemManutencao = statusOrdemManutencao;
    }

    public OrdemManutencao(Maquina maquinaID, Tecnico tecnicoID, Date dataSolicitacao, String statusOrdemManutencao) {
        this.maquinaID = maquinaID;
        this.tecnicoID = tecnicoID;
        this.dataSolicitacao = dataSolicitacao;
        this.statusOrdemManutencao = statusOrdemManutencao;
    }

    public int getId() {
        return id;
    }

    public Maquina getMaquinaID() {
        return maquinaID;
    }

    public Tecnico getTecnicoID() {
        return tecnicoID;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getStatusOrdemManutencao() {
        return statusOrdemManutencao;
    }
}
