import java.util.ArrayList;
import java.util.Random;

public class Papagaio extends Passaro{

    public Papagaio(String nome, String bico, String porte, String tipo){
        super(nome, bico, porte, tipo);
    }

    String[] falas = new String[]{"Olá", "Boa noite", "fiu-fiu", "como vai?", "Quero café!"};

    Random random = new Random();

    public String gerarFala(){
        return falas[random.nextInt(falas.length)];
    }
}
