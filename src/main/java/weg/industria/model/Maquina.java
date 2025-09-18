package weg.industria.model;

public class Maquina {

    private int id;
    private String nome;
    private String setor;
    private String status;


    public Maquina(int id, String nome, String setor, String status) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.status = status;
    }

    public Maquina(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public Maquina(String nome, String setor, String status) {
        this.nome = nome;
        this.setor = setor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString (){
        return "ID: " + id + "  Nome: " + nome + "  Setor: " + setor + "  Status: " + status;
    }
}
