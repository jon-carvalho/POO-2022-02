package Entidades;


    /*
    Esta classe representa os caminhoes

    Ela herda os principais atributos da classe veículo e também possui seus próprios atributos
    Fiquem à vontade para enriquecer, pois é uma visão bem simplificada.
     */


public class Caminhao extends Veiculo {

    private String categoria; //pesado, semipesado, leve
    private String eixos;

    public Caminhao(String marca, String modelo, String combustivel, String placa, String categoria, String eixos) {
        super(marca, modelo, combustivel, placa);
        this.categoria = categoria;
        this.eixos = eixos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEixos() {
        return eixos;
    }

    public void setEixos(String eixos) {
        this.eixos = eixos;
    }
}
