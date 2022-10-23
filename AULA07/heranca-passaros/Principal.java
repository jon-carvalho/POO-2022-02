import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Avestruz avestruz = new Avestruz("Avestruz", "Curvado", "Grande", "Corredora");
        Papagaio papagaio = new Papagaio("Papagaio", "Curvado", "Pequeno", "Falador");
        Pinguim pinguim = new Pinguim("Pinguiem", "Pontudo", "Grande", "Nadador");
        Falcao falcao = new Falcao("Falcao", "Afiado", "Médio", "Caçador");

        System.out.println("*****************************************************");
        System.out.println("AVESTRUZ");
        System.out.println("*****************************************************");

        int corrida = avestruz.Corre();
        System.out.println("Iniciando corrida: " + corrida + "Km/h");
        corrida += avestruz.Corre();
        System.out.println("Aumentando velocidade: " + corrida + "Km/h");
        corrida += avestruz.Corre();
        System.out.println("Aumentando velocidade: " + corrida + "Km/h");

        Double andaAvestruz = avestruz.Anda(avestruz.getNome());
        System.out.println("Andou "+ andaAvestruz + "m");
        andaAvestruz += avestruz.Anda(avestruz.getNome());
        System.out.println("Andou "+ andaAvestruz + "m");
        andaAvestruz += avestruz.Anda(avestruz.getNome());
        System.out.println("Andou "+ andaAvestruz + "m");

        System.out.println("*****************************************************");
        System.out.println("PAPAGAIO");
        System.out.println("*****************************************************");

        System.out.println(papagaio.gerarFala());


        System.out.println("*****************************************************");
        System.out.println("FALCÃO");
        System.out.println("*****************************************************");


        System.out.println(falcao.Cacando());

    }
}
