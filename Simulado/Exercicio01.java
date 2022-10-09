import java.util.Date;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de seu nascimento");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o mes de seu nascimento");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o dia de seu nascimento");
        int diaNascimento = scanner.nextInt();

        System.out.println("Digite o ano atual");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o mes atual");
        int mesAtual = scanner.nextInt();

        System.out.println("Digite o dia atual");
        int diaAtual = scanner.nextInt();

        CalculoIdade calculoIdade = new CalculoIdade();

        System.out.println("Sua idade em dias é: " + (calculoIdade.CalculaTempoEmDias(anoAtual, mesAtual, diaAtual) - calculoIdade.CalculaTempoEmDias(anoNascimento, mesNascimento, diaNascimento)) );
    }




}
