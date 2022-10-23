package Cadastro;

    /*
    Esta classe serve para realizar o cadastro de um motorista
     */

import Entidades.Motorista;
import java.util.Scanner;

public class CadastroDeMotorista {


    public Motorista cadastrarMotorista() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Motorista: ");
        String nomeMotorista = scanner.next();

        System.out.println("Digite a CNH do Motorista: ");
        String cnhMotorista = scanner.next();

        return new Motorista(nomeMotorista, cnhMotorista);

    }
}
