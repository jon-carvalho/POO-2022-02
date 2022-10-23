package Outros;

import Entidades.*;
import Perfis.PerfilAgente;

import java.util.ArrayList;

public class BancoDeDados {

/*
Essa classe foi criada com o intuito de simular uma transação de puxar dados do banco de dados.
Aqui vocês encontrarão apenas classes que vão puxar os dados anteriormente cadastrados.
 */

    public Motorista retornaMotoristas(String nomeMotorista, ArrayList<Motorista> motoristas){

        for(int i = 0; i <= motoristas.size(); i++){
            if(nomeMotorista.equals(motoristas.get(i).getNome())){
                System.out.println("Motorista encontrado");
                return motoristas.get(i);
            }
        }
        System.out.println("Motorista não encontrado");
        return null;
    }


    public Moto retornaMoto(String placaMoto, ArrayList<Moto> motos){

        for(int i = 0; i <= motos.size(); i++){
            if(placaMoto.equals(motos.get(i).getPlaca())){
                System.out.println("Moto encontrada");
                return motos.get(i);
            }
        }
        System.out.println("Moto não encontrado");
        return null;
    }

    public Automovel retornaAutomovel(String placaAutomovel, ArrayList<Automovel> automoveis){

        for(int i = 0; i <= automoveis.size(); i++){
            if(placaAutomovel.equals(automoveis.get(i).getPlaca())){
                System.out.println("Automóvel encontrado");
                return automoveis.get(i);
            }
        }
        System.out.println("Automóvel não encontrado");
        return null;
    }

    public Caminhao retornaCaminhao(String placaCaminhao, ArrayList<Caminhao> caminhoes){

        for(int i = 0; i <= caminhoes.size(); i++){
            if(placaCaminhao.equals(caminhoes.get(i).getPlaca())){
                System.out.println("Caminhão encontrado");
                return caminhoes.get(i);
            }
        }
        System.out.println("Caminhão não encontrado");
        return null;
    }

    public void retornaMultasDeMotos(ArrayList<Multa> multas){
        for(int i = 0; i < multas.size(); i++){
            System.out.println("------------------------------------------------------");
            System.out.println("Nome motorista: " + multas.get(i).getMotorista().getNome());
            System.out.println("Moto com placa: " + multas.get(i).getMoto().getPlaca());
            System.out.println("Valor da multa: " + multas.get(i).valorMulta);
        }
        System.out.println("------------------------------------------------------");
    }

    public void retornaMultasDeAutomoveis(ArrayList<Multa> multas){
        for(int i = 0; i < multas.size(); i++){
            System.out.println("------------------------------------------------------");
            System.out.println("Nome motorista: " + multas.get(i).getMotorista().getNome());
            System.out.println("Automóvel com placa: " + multas.get(i).getAutomovel().getPlaca());
            System.out.println("Valor da multa: " + multas.get(i).valorMulta);
        }
            System.out.println("------------------------------------------------------");
    }

    public void retornaMultasDeCaminhoes(ArrayList<Multa> multas){
        for(int i = 0; i < multas.size(); i++){
            System.out.println("------------------------------------------------------");
            System.out.println("Nome motorista: " + multas.get(i).getMotorista().getNome());
            System.out.println("Caminhao com placa: " + multas.get(i).getCaminhao().getPlaca());
            System.out.println("Valor da multa: " + multas.get(i).valorMulta);
        }
            System.out.println("------------------------------------------------------");
    }
}
