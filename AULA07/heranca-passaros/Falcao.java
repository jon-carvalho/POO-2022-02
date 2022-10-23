import java.util.Random;

public class Falcao extends Passaro{

    public Falcao(String nome, String bico, String porte, String tipo){
        super(nome, bico, porte, tipo);
    }

    Random random = new Random();

    public String Cacando() {
        return Capturou(random.nextBoolean());
    }

    public String Capturou(boolean cacando) {
        if(cacando == true){
            return "Capturou a caça";
        } else {
            return "Não capturou a caça";
        }
    }
}
