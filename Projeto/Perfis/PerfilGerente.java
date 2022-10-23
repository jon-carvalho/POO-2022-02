package Perfis;

import Outros.MenuPrincipal;

import java.util.Scanner;

public class PerfilGerente {

   /*
    Essa classe representa o perfil do Gerente conforme descrito nas orientações do projeto

    Obs: esse perfil não foi finalizado, este é apenas um esboço
     */

    public void visualizacaoGerente() {
        Scanner scanner = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();


        System.out.println("Digite a opção: ");
        System.out.println("1 - Cadastrar motorista \n " +
                "2 - Cadastrar moto \n" +
                "3 - Cadastrar automóvel \n" +
                "4 - Cadastrar caminhão \n" +
                "5 - Cadastrar multa \n" +
                "6 - Visualizar multas" +
                "\n" +
                "0 - Voltar para o menu anterior");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 0:
                menuPrincipal.executarMenuPrincipal();
            break;
            case 1:
                break;
            case 2:
                break;

                // ...........
        }
    }
}
