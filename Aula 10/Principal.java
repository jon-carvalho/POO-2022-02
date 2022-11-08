import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Engenheiro engenheiro = new Engenheiro("Joao", "12.345.678-9", "123.456.789-10", "masculino", "11-12345-1234");

        engenheiro.setCrea("1234567890");

        Professor professor = new Professor("Maria", "98.765.432-1", "109.876.543-21",
                "feminino", "11-54321-4321", true, "história");

        Pessoa pessoa = new Pessoa("Julio", " 11.111.111-1", "111.111.111-11",
                "masculino", "11-11111-1111");


        Scanner scanner = new Scanner(System.in);

        System.out.println(pessoa.getCpf());

        System.out.println("Digite qual conteúdo quer aprender? (Digite de 1 a 3)");
        int escolha = scanner.nextInt();

        System.out.println(professor.ensinarConteudo(escolha - 1));

        System.out.println("Digite qual projeto voce deseja? (Digite: casa ou edificio)");
        String projeto = scanner.next();

        System.out.println(engenheiro.projetarConstrucao(projeto));

        System.out.println("Digite o número do seu candidato:");
        int voto = scanner.nextInt();

        System.out.println(engenheiro.votarNoSegundoTurno(voto));
    }
}
