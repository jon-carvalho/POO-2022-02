import java.util.Scanner;

public class Exercicio03 {

/*
Faça um algoritmo que tenha uma variavel chamada idade e que tenha como resultado sua idade
    -Caso sua idade for ímpar e você já atingiu a maioridade, o algoritmo deve exibir a seguinte mensagem:
        Sua idade é ímpar e você é de maior
    -Caso sua idade seja par e você já atingiu a maioridade, o algoritmo deve exibir a seguinte mensagem:
        Sua idade é par e você é de maior
    -Caso você seja menor de idade, o algoritmo não deve exibir nada.

*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();


        if(idade % 2 == 1 && idade >= 18){
            System.out.println("Sua idade é ímpar e você é de maior");
        } else if(idade % 2 == 0 && idade >= 18){
            System.out.println("Sua idade é par e você é de maior");

        }

    }


}
