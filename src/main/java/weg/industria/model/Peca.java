package weg.industria.model;

public class Peca {

    private int id;
    private String nome;
    private double estoque;

    public Peca(int id, String nome, double estoque) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
    }

    public Peca(String nome, double estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getEstoque() {
        return estoque;
    }

    @Override
    public String toString(){
        return "ID: " + id + "Nome: " + nome + "Estoque: " + estoque;
    }
}
