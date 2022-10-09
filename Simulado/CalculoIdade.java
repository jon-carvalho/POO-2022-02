public class CalculoIdade {

    public int CalculaTempoEmDias(int ano, int mes, int dia) {
        int idadeEmDias = ano * 365;
        idadeEmDias += mes * 30;
        idadeEmDias += dia;

        return idadeEmDias;
    }
}
