package Perfis;
import Outros.BancoDeDados;
import Outros.MenuPrincipal;

import java.util.Scanner;

public class PerfilMotorista {

/*
    Essa classe representa o perfil do Motorista conforme descrito nas orientações do projeto

    Obs: esse perfil não foi finalizado, este é apenas um esboço
     */



    public void visualizacaoMotorista(){
        Scanner scanner = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();

        System.out.println("Digite a opção:");
        System.out.println("1 - Visualizar Multas \n" +
                "\n" +
                "0 - Voltar para o menu anterior");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 0:
                menuPrincipal.executarMenuPrincipal();
                break;
            case 1:
                System.out.println("Retorna a lista de multas.");
                break;
        }

    }
}
