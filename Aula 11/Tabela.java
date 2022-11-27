import java.util.Scanner;

public class Tabela {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] clubes = new String[5];
        int[][] pontuacao = new int[5][5];


        for(int i=0; i<5; i++){
            System.out.println("Digite o nome do clube: ");
            clubes[i] = scanner.next();
        }

        for(int i=0; i<5; i++){
            System.out.println("Digite a pontuação do clube " + clubes[i] + ": ");
            for(int j=0; j<5; j++){
                System.out.println("Digite a pontuação da rodada " + (j+1) + ": ");
                pontuacao[i][j] = scanner.nextInt();
            }
        }


        for(int i=0; i<5; i++){
            int total =0;
            System.out.println("Pontuação " + clubes[i] + ": ");
            for(int j=0; j<5; j++){
                System.out.print(" | " + pontuacao[i][j] + " | ");
                total += pontuacao[i][j];
            }
            System.out.print(" == || TOTAL : " + total + " ||");
            System.out.println();
        }

    }
}
