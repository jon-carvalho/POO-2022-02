package Cadastro;

import Entidades.*;
import Outros.BancoDeDados;

/*
    Esta classe serve para realizar o cadastro de multas
    Dentro dela existe um sub-menu para cadastrar multas em motos, carros ou caminhoes
    Além disso cada cadastro possui seu próprio método
     */

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeMultas {

    BancoDeDados bancoDeDados = new BancoDeDados();
    Scanner scanner = new Scanner(System.in);
    int escolha = 0;

    public Multa cadastrarMulta(ArrayList<Motorista> motoristas, ArrayList<Moto> motos,
                               ArrayList<Caminhao> caminhoes, ArrayList<Automovel> automoveis) {
        System.out.println("Digite a opção: ");
        System.out.println("1 - Cadastrar multa em moto \n" +
                "2 - Cadastrar multa em automóvel \n" +
                "3 - Cadastrar multa em caminhão"
                );
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                return cadastrarMultasEmMoto(motoristas, motos);
            case 2:
                return cadastrarMultasEmAutomovel(motoristas, automoveis);
            case 3:
                return cadastrarMultasEmCaminhao(motoristas, caminhoes);
        }

        return null;

    }

    public Multa cadastrarMultasEmMoto(ArrayList<Motorista> motoristas, ArrayList<Moto> motos){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do motorista que levou a multa?");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a placa da moto?");
        String placaMoto = scanner.next();

        System.out.println("Qual o valor da multa?");
        Double valorMulta = scanner.nextDouble();


        Motorista motorista = bancoDeDados.retornaMotoristas(nomeMotorista, motoristas);
        Moto moto = bancoDeDados.retornaMoto(placaMoto, motos);

        return new Multa(motorista, moto, valorMulta);
    }

    public Multa cadastrarMultasEmAutomovel(ArrayList<Motorista> motoristas, ArrayList<Automovel> automoveis){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do motorista que levou a multa?");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a placa do automovel?");
        String placaAutomovel = scanner.next();

        System.out.println("Qual o valor da multa?");
        Double valorMulta = scanner.nextDouble();


        Motorista motorista = bancoDeDados.retornaMotoristas(nomeMotorista, motoristas);
        Automovel automovel = bancoDeDados.retornaAutomovel(placaAutomovel, automoveis);

        return new Multa(motorista, automovel, valorMulta);
    }

    public Multa cadastrarMultasEmCaminhao(ArrayList<Motorista> motoristas, ArrayList<Caminhao> caminhoes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do motorista que levou a multa?");
        String nomeMotorista = scanner.next();

        System.out.println("Qual a placa do caminhao?");
        String placaCaminhao = scanner.next();

        System.out.println("Qual o valor da multa?");
        Double valorMulta = scanner.nextDouble();


        Motorista motorista = bancoDeDados.retornaMotoristas(nomeMotorista, motoristas);
        Caminhao caminhao = bancoDeDados.retornaCaminhao(placaCaminhao, caminhoes);

        return new Multa(motorista, caminhao, valorMulta);
    }

}
