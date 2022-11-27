import java.util.Scanner;

public class Exercicio01 {
/*
Em uma variavel chamada nome insira seu nome, e em uma variavel chamada rgm insira os 3 ultimos digitos do seu rgm.
Realize uma divisão dos digitos do seu rgm pelo número de letras do seu nome.
E crie um laço de repetição que deverá imprimir seu nome o tanto de vezes que for o resultado da divisão
*/

    public static void main(String[] args) {

        String nome = "Jonatas";
        int rgm = 999;

        double divisao = rgm / nome.length();

        for(int i=1; i<=divisao; i++){
            System.out.println(i + " - " + nome);
        }

    }
}
