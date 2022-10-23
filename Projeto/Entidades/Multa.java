package Entidades;

/*
    Esta classe representa as multas

    Na minha visão fica entendido que uma multa é composta por: um Motorista, um Veículo (podendo ser Moto, Carro ou Caminhão) e um valor.
    Fiquem à vontade para enriquecer, pois é uma visão bem simplificada.
     */

public class Multa {

    Motorista motorista;
    Moto moto;
    Automovel automovel;
    Caminhao caminhao;
    public Double valorMulta;

    public Multa(Motorista motorista, Moto moto, Double valorMulta) {
        this.motorista = motorista;
        this.moto = moto;
        this.valorMulta = valorMulta;
    }

    public Multa(Motorista motorista, Automovel automovel, Double valorMulta) {
        this.motorista = motorista;
        this.automovel = automovel;
        this.valorMulta = valorMulta;
    }

    public Multa(Motorista motorista, Caminhao caminhao, Double valorMulta) {
        this.motorista = motorista;
        this.caminhao = caminhao;
        this.valorMulta = valorMulta;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Double getMulta() {
        return valorMulta;
    }

    public void setMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }
}
