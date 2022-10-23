public class Passaro {

    private String nome;
    private String bico;
    private String porte;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBico() {
        return bico;
    }

    public void setBico(String bico) {
        this.bico = bico;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public Passaro(String nome, String bico, String porte, String tipo){
        this.nome = nome;
        this.bico = bico;
        this.porte = porte;
        this.tipo = tipo;
    }

    public Double Anda(String nome){
        if(nome.toLowerCase().equals("avestruz")){
            return 1.0;
        } else if(nome.toLowerCase().equals("pinguim")){
            return 0.3;
        } else if(nome.toLowerCase().equals("papagaio")){
            return 0.2;
        } else {
            return 0.1;
        }
    }

    public String Voo(String nome){
        if(nome.toLowerCase().equals("avestruz")){
            return "não voa";
        } else if(nome.toLowerCase().equals("pinguim")){
            return "não voa";
        } else if(nome.toLowerCase().equals("papagaio")){
            return "voa devagar";
        } else if(nome.toLowerCase().equals("falcao")){
            return "voa muito rápido";
        } else {
            return "passaro não categorizado";
        }
    }


}
