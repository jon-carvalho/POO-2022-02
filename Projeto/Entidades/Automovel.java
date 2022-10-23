package Entidades;
    /*
    Esta classe representa os carros

    Ela herda os principais atributos da classe veículo e também possui seus próprios atributos
    Fiquem à vontade para enriquecer, pois é uma visão bem simplificada.
     */

public class Automovel extends Veiculo {

    private String portas;
    private String airBag;

    public Automovel(String marca, String modelo, String combustivel, String placa, String portas, String airBag) {
        super(marca, modelo, combustivel, placa);
        this.portas = portas;
        this.airBag = airBag;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public String getAirBag() {
        return airBag;
    }

    public void setAirBag(String airBag) {
        this.airBag = airBag;
    }
}
