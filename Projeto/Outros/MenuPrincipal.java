package Outros;

import Cadastro.CadastroDeMultas;
import Perfis.PerfilAgente;
import Perfis.PerfilGerente;
import Perfis.PerfilMotorista;

import java.util.Scanner;

public class MenuPrincipal {
    /*
    Essa classe é apenas uma classe para exibir o menu principal da aplicação
     */

    public void executarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);


        PerfilMotorista perfilMotorista = new PerfilMotorista();
        PerfilAgente perfilAgente = new PerfilAgente();
        PerfilGerente perfilGerente = new PerfilGerente();

        CadastroDeMultas cadastroDeMultas = new CadastroDeMultas();

        System.out.println("Olá, seja bem vindo ao sistema de cadastro de multas");
        System.out.println("Qual perfil deseja acessar: \n" +
                "1 - Motorista \n" +
                "2 - Agente \n" +
                "3 - Gerente");
        int escolhaPerfil = scanner.nextInt();

        switch(escolhaPerfil){
            case 1:
                perfilMotorista.visualizacaoMotorista();
                break;
            case 2:
                perfilAgente.visualizacaoAgente();
                break;
            case 3:
                perfilGerente.visualizacaoGerente();
        }
    }
}
