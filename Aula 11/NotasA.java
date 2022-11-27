import java.util.Scanner;

public class NotasA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome1 = scanner.next();

        System.out.println("Digite a nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Digite o nome do aluno: ");
        String nome2 = scanner.next();

        System.out.println("Digite a nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Digite o nome do aluno: ");
        String nome3 = scanner.next();

        System.out.println("Digite a nota: ");
        Double nota3 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3)/3;

        if(nota1 >= media) System.out.println("Parabéns " + nome1);

        if(nota2 >= media) System.out.println("Parabéns " + nome2);

        if(nota3 >= media) System.out.println("Parabéns " + nome3);

    }
}
