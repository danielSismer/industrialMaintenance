package weg.industria.view;

import weg.industria.model.Maquina;
import weg.industria.model.Peca;
import weg.industria.model.Tecnico;

import java.util.Scanner;

public class UserIF {

    static Scanner input = new Scanner(System.in);

    public static int menu() {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Cadastrar Máquina");
        System.out.println("2. Cadastrar Técnico");
        System.out.println("3. Cadastrar Peça");
        System.out.println("4. Criar Ordem de Manutenção");
        System.out.println("5. Associar Peça à Ordem de Manutenção");
        System.out.println("6. Executar Manutenção");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }

    public static Maquina credenciaisMaquina() {
        input.nextLine();
        System.out.println("\n=== Cadastrar Máquina ===");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Setor: ");
        String setor = input.nextLine();

        return new Maquina(nome, setor);
    }

    public static Tecnico credenciaisTecnico() {
        input.nextLine();
        System.out.println("\n=== Cadastrar Técnico ===");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = input.nextLine();
        return new Tecnico(nome, especialidade);
    }

    public static Peca credenciaisPeca() {
        input.nextLine();
        System.out.println("\n=== Cadastrar Peça ===");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Quantidade Incial do Estoque: ");
        double estoque = input.nextDouble();
        input.nextLine();
        return new Peca(nome, estoque);
    }
}
