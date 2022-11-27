import java.util.Scanner;

public class Exercicio02 {
/*
    Na votação do Brasil só temos segundo turno quando um dos candidatos não atinge 51% dos votos validos.
    Crie um algoritmo que:
    -Caso  Bolsonaro atingir 51% dos votos o sistema deve exibir a seguinte mensagem: Bolsonaro ganhou no primeiro turno
    -Caso o Lula atingir 51% dos votos o sistema deve exibir a seguinte mensagem:
    Lula ganhou no primeiro turno
    -Caso Simone Tebet atinja 51% dos votos o sistema deve exibir a seguinte mensagem:
    Tebet ganhou no primeiro turno
    -Caso nenhuma das opções acima aconteça o sistema deve exibir a seguinte mensagem:
    Vamos ter segundo turno
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a porcentagem de votos do Bolsonaro");
        int bolsonaro = scanner.nextInt();

        System.out.println("Digite a porcentagem de votos do Lula");
        int lula = scanner.nextInt();

        System.out.println("Digite a porcentagem de votos da Simone Tebet");
        int tebet = scanner.nextInt();

        if(bolsonaro >= 51){
            System.out.println("Bolsonaro ganhou no primeiro turno");
        } else if(lula >= 51){
            System.out.println("Lula ganhou no primeiro turno");
        } else if(tebet >= 51){
            System.out.println("Tebet ganhou no segundo turno");
        } else {
            System.out.println("Vamos ter segundo turno");
        }



    }
}
