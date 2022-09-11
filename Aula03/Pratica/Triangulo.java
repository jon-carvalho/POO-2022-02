package Aula03.Pratica;


//EXEMPLO03-B

public class Triangulo {
    float base;
    float altura;

    Triangulo() {

    }

    Triangulo(float b, float a){
        base = b;
        altura = a;
    }

    public Float calculoDeArea(float base, float altura)
    {
        return (base * altura)/2;

    }
}
