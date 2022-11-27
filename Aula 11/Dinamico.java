import java.util.ArrayList;
import java.util.Scanner;

public class Dinamico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int escolha = 0;

        do {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.next();

            System.out.println("Digite o telefone da pessoa: ");
            String fone = scanner.next();

            pessoas.add(new Pessoa(nome, fone));

            System.out.println("Para cadastrar outra pessoa digite 1 \n" +
                    "Para exibir a lista de pessoas digite 0");
            escolha =  scanner.nextInt();
        } while(escolha != 0);


        for(int i = 0; i < pessoas.size(); i++){
            System.out.println("Pessoa " + (i+1) + ": ");
            System.out.println("|| Nome: " + pessoas.get(i).getNome() + " || Fone: " + pessoas.get(i).getFone()  + " ||");
        }
    }
}
