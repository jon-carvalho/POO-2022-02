import java.util.ArrayList;

public class Professor extends Pessoa {

    private Boolean servidorPublico;
    private String especialidade;

    public Professor(String nome, String rg, String cpf, String sexo, String telefone, Boolean servidorPublico, String especialidade) {
        super(nome, rg, cpf, sexo, telefone);
        this.servidorPublico = servidorPublico;
        this.especialidade = especialidade;
    }


    public Boolean getServidorPublico() {
        return servidorPublico;
    }

    public void setServidorPublico(Boolean servidorPublic) {
        this.servidorPublico = servidorPublic;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String ensinarConteudo(int escolha) {

        String[] conteudos = {
                "A História do Brasil começa com a chegada dos primeiros humanos na América do Sul há pelo menos 22 000 anos AP. Em fins do século XV, quando do Tratado de Tordesilhas, toda a área hoje conhecida como Brasil era habitada por tribos seminômades que subsistiam da caça, pesca, coleta e agricultura",
                "Revolução Francesa foi um período, entre 1789 e 1799, de intensa agitação política e social na França, que teve um impacto duradouro na história do país e, mais amplamente, em todo o continente europeu. A monarquia absolutista que tinha governado a nação durante séculos entrou em colapso em apenas três anos.",
                "União das Repúblicas Socialistas Soviéticas ou simplesmente União Soviética, foi um Estado socialista localizado no norte da Eurásia que se estendeu desde os mares Báltico e Negro até o Oceano Pacífico, e que existiu entre 1917/22 e 1991."
        };
        return conteudos[escolha];
    }
}
