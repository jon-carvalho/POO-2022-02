import java.util.Scanner;

public class Desafio01b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(x + " x " + i + " = " +  (x*i));
        }

        String line = "";
        for (var i = 1; i <= 10; i++) {
            for (var j = 1; j <= i; j++) {
                line += "*";
            }
            System.out.println(line);
            line = "";
        }
    }
}
