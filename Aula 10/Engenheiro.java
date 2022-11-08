public class Engenheiro extends Pessoa implements Eleitor{

    private String crea;

    public Engenheiro(String nome, String rg, String cpf, String sexo, String telefone) {
        super(nome, rg, cpf, sexo, telefone);
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String projetarConstrucao(String construcao) {

        String[] estrutura = {
                "Para a construção de uma casa precisamos de: \n"+
                        "vigas, tijolos, areia e pedra",
                "Para a construção de um prédio precisamos de: \n"+
                        "vergalhões de aço maciço e concreto profissional",

        };

        if(construcao.equals("casa")){
            return estrutura[0];
        } else {
            return estrutura[1];
        }
    }

    @Override
    public String votarNoSegundoTurno(int voto) {
        if(voto == 13){
            return "Parabéns, votou em um ladrão!";
        } else if(voto == 22) {
            return "Parabéns, votou em genocida!";
        } else {
            return "Parabéns, você tem cérebro";
        }
    }
}
