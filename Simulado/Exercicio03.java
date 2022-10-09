import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        int agora = LocalDateTime.now().getHour();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        if(agora <= 11 && agora >= 6){
            System.out.println("Bom dia " + nome);
        } else if(agora >= 12 && agora <= 17){
            System.out.println("Boa tarde " + nome);
        } else if(agora >= 18 && agora <= 23){
            System.out.println("Boa noite " + nome );
        } else {
            System.out.println("Boa madrugada " + nome);
        }
    }
}
