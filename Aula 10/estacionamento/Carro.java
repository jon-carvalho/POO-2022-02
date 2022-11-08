import java.time.LocalDateTime;

/*
essa é a classe herda os atributos da classe veículo, e coloca outros atributos

doce doce como mel
 */
public class Carro extends Veiculo{

    private String cor;
    private String ano;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Carro(String placa, String marca, String modelo, String cor, String ano, LocalDateTime entrada) {
        super(placa, marca, modelo);
        this.cor = cor;
        this.ano = ano;
        this.entrada = entrada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }


}
