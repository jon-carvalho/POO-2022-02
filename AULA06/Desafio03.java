public class Desafio03 {


    public static void main(String[] args) {



        String name = "Jonatas";
        String middleName = "Gomes";
        String lastName = "Carvalho";

        System.out.println(name.length());

        for(int i = 0; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(name);
            } else if(i % 3 == 0){
                System.out.println(name + middleName);
            } else if(i % 7 == 0){
                System.out.println(name + middleName + lastName);
            }
        }


    }
}
