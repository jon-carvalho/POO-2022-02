package package02;

import package01.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Joao";
        pessoa.setIdade(18);
        pessoa.score = 256;
        pessoa.setEndereco("Rua Guarapiranga, 550");
        pessoa.setCpf("12345678910");

        System.out.println(pessoa.retornaDados());
    }
}
