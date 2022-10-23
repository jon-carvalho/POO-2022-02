package Entidades;

/*
    Esta classe representa as motos

    Ela herda os principais atributos da classe veículo e também possui seus próprios atributos
    Fiquem à vontade para enriquecer, pois é uma visão bem simplificada.
     */

public class Moto extends Veiculo {

    private String tipoDeFreio;
    private String carenagem;

    public Moto(String marca, String modelo, String combustivel, String placa, String tipoDeFreio, String carenagem) {
        super(marca, modelo, combustivel, placa);
        this.tipoDeFreio = tipoDeFreio;
        this.carenagem = carenagem;
    }

    public String getTipoDeFreio() {
        return tipoDeFreio;
    }

    public void setTipoDeFreio(String tipoDeFreio) {
        this.tipoDeFreio = tipoDeFreio;
    }

    public String getCarenagem() {
        return carenagem;
    }

    public void setCarenagem(String carenagem) {
        this.carenagem = carenagem;
    }
}
