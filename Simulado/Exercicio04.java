public class Exercicio04 {

    public static void main(String[] args) {

        String texto = "";

        for(int i = 1; i<=6; i++){

            int resultado = (int)Math.round(Math.random() * 100);

            if(resultado < 10){
                texto += "0" + resultado + " ";
            } else {
                   texto += resultado + " ";
            }
        }

        System.out.println(texto);

    }
}
