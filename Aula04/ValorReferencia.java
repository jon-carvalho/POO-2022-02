package Aula04;

//Exemplo 01

import Aula02.Prática.Pessoa;

public class ValorReferencia {



    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = valor1;

        System.out.println("Somando 5 ao valor1 "+ (valor1+5));
        System.out.println("Somando 5 ao valor2 "+ (valor2+5));


        Pessoa p1 = new Pessoa("Jonatas", "12345678910");
        Pessoa p2 = p1;

        System.out.println(" " + p1.nome + " " + p1.cpf);
        System.out.println(" " + p2.nome + " " + p2.cpf);

        p1.nome = "Jose";
        System.out.println(" " + p1.nome + " " + p1.cpf);
        System.out.println(" " + p2.nome + " " + p2.cpf);

//        DESAFIO
        int v1 = 3;
        int v2 = v1;
        int v3 = v1 + v2;
        System.out.println(v3);



    }


}
