package weg.industria.model;

public enum StatusMaquina {

    OPERACIONAL("OPERACIONAL"), EM_MANUTENCAO("EM_MANUTENCAO");

    private final String escolha;

    StatusMaquina(String escolha) {
        this.escolha = escolha;
    }

    @Override
    public String toString (){
        return escolha;
    }
}
