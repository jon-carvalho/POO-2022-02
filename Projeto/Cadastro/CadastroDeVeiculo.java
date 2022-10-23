package Cadastro;

import Entidades.Caminhao;
import Entidades.Moto;
import Entidades.Automovel;

/*
Esse classe foi criada para  o cadastro de veículos , no qual, cada veículo possui seu próprio método
 */

import java.util.Scanner;

public class CadastroDeVeiculo {
        Scanner scanner = new Scanner(System.in);

    public Moto cadastrarMoto() {

        System.out.println("Digite o nome da marca: ");
        String motoMarca = scanner.next();

        System.out.println("Digite o nome do modelo: ");
        String motoModelo = scanner.next();

        System.out.println("Digite o tipo de combustível: ");
        String motoCombustivel = scanner.next();

        System.out.println("Digite a placa da moto: ");
        String placaMoto = scanner.next();

        System.out.println("Digite o tipo do freio: ");
        String motoTipoFreio = scanner.next();

        System.out.println("Digite se possui carenagem: ");
        String motoCarenagem = scanner.next();

        return new Moto(motoMarca, motoModelo, motoCombustivel, placaMoto, motoTipoFreio, motoCarenagem);

    }

    public Automovel cadastrarAutomovel() {
        System.out.println("Digite o nome da marca: ");
        String autoMarca = scanner.next();

        System.out.println("Digite o nome do modelo: ");
        String autoModelo = scanner.next();

        System.out.println("Digite o tipo de combustível: ");
        String autoCombustivel = scanner.next();

        System.out.println("Digite o número da placa: ");
        String autoPlaca = scanner.next();

        System.out.println("Digite a quantidade de portas: ");
        String autoPortas = scanner.next();

        System.out.println("Possui airbag? ");
        String autoAirbag = scanner.next();

        return new Automovel(autoMarca, autoModelo, autoCombustivel, autoPlaca, autoPortas, autoAirbag);


    }

    public Caminhao cadastrarCaminhao() {
        System.out.println("Digite o nome da marca: ");
        String caminhaoMarca = scanner.next();

        System.out.println("Digite o nome do modelo: ");
        String caminhaoModelo = scanner.next();

        System.out.println("Digite o tipo de combustível: ");
        String caminhaoCombustivel = scanner.next();

        System.out.println("Digite o número da placa: ");
        String caminhaoPlaca = scanner.next();

        System.out.println("Digite a categoria: ");
        String caminhaoCategoria = scanner.next();

        System.out.println("Digite o número de eixos: ");
        String caminhaoEixos = scanner.next();

        return new Caminhao(caminhaoMarca, caminhaoModelo, caminhaoCombustivel, caminhaoPlaca, caminhaoCategoria, caminhaoEixos);


    }
}
