package Entidades;

public class Veiculo  {

    /*
    Esta classe representa os veículos

    Essa é a classe mãe com os principais atributos que um veículo possui.
    Fiquem à vontade para enriquecer, pois é uma visão bem simplificada.
     */

    private String marca;
    private String modelo;
    private String combustivel;
    private String placa;

    public Veiculo(String marca, String modelo, String combustivel, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
