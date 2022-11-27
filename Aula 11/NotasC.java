import java.util.Scanner;

public class NotasC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] notas = new Double[40];
        String[] nomes = new String[40];

        Double soma = 0.0;

        for(int i = 0; i<40; i++){
            System.out.println("Digite o nome do aluno: ");
            nomes[i] = scanner.next();

            System.out.println("Digite a nota: ");
            notas[i] = scanner.nextDouble();

            soma += notas[i];
        }

        Double media = soma / 40;

        for(int i = 0; i<40; i++){
            if(notas[i] > media) System.out.println("Parabens " + nomes[i]);
        }
    }
}
