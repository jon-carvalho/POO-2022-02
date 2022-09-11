package Aula04;

public class PrincipalCalculadoras {


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();

        int a,b;
        a=10;
        b=20;

        calculadoraSimples.adicao(a,b);
        calculadoraSimples.subtracao(a,b);
        calculadoraSimples.divisão(a,b);
        calculadoraSimples.multiplicacao(a,b);

        calculadora.interacao();


    }
}
