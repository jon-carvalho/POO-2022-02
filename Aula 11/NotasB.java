import java.util.Scanner;

public class NotasB {

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

        Double[] notas = {nota1, nota2, nota3};
        String[] nomes = {nome1, nome2, nome3};

        for(int i=0; i<notas.length; i++){
            if (notas[i] < media) System.out.println("Parabens " + nomes[i]);
        }
    }
}
