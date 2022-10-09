import java.util.Random;
import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int i = 1;


        Random aleatorio = new Random();
        int num = aleatorio.nextInt(20);
        System.out.println(num);

        do {
            System.out.println("Adivinhe o número: ");
            x = scanner.nextInt();


            if(x == num){
                System.out.println("Parabens você acertou em " + i + "tentativa(s)");
            } else if(x > num) {
                System.out.println("O número sorteado é menor que " + x);
            } else if(x < num) {
                System.out.println("O número sorteado é maior que " + x);
            }

            i++;

        } while(x != num);

    }
}
