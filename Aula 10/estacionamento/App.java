import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Carro> estacionamento = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("Seja bem vindo ao nosso estacionamento!\n" +
                    "Digite uma opção:\n"
                    + "1 - Cadastrar veículo\n"
                    + "2 - Remover veículo\n"
                    + "3 - Exibição de veículos estacionados\n"
                    + "4 - Registrar saída de veículos\n\n"

                    + "5 - Sair do Sistema\n");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a placa do carro: ");
                    String placaCarro = scanner.next();

                    System.out.println("Digite a marca do carro: ");
                    String marcaCarro = scanner.next();

                    System.out.println("Digite o modelo do carro: ");
                    String modeloCarro = scanner.next();

                    System.out.println("Digite a cor do carro: ");
                    String corCarro = scanner.next();

                    System.out.println("Digite o ano do carro: ");
                    String anoCarro = scanner.next();

                    System.out.println("Digite a data e hora de entrada do carro (Exemplo: 16/07/2022 16:07): ");
                    String entradaCarro = scanner.next();

                    //convertendo string em localdatetime para calculo futuro
                    LocalDateTime entradaConvertidaCarro = converterDataHora(entradaCarro);

                    estacionarVeiculo(placaCarro, marcaCarro, modeloCarro, corCarro, anoCarro, entradaConvertidaCarro);
                break;
                case 2:
                    System.out.println("Digite a placa do carro que deseja remover: ");
                    String placaRemover = scanner.next();
                    removerVeiculo(placaRemover);
                break;
                case 3:
                    System.out.println("Os veículos que esão estacionados são: ");
                    System.out.println(veiculosEstacionados());
                break;
                case 4:
                    System.out.println("Digite a placa do carro que deseja registrar a saída: ");
                    String placaSaida = scanner.next();
                    System.out.println(saidaDeVeiculo(placaSaida));
                break;
            }
        }while (escolha != 5);
    }

    //método para realizar o registro do estacionamento
    //a cada carro cadastrado ele adiciona um novo objeto no array que foi criado na linha 9 e é chamado de estacionamento
    public static void estacionarVeiculo(String placaCarro, String marcaCarro, String modeloCarro,
                                         String corCarro, String anoCarro, LocalDateTime entradaCarro){

        //criando um novo carro
        Carro carro = new Carro(placaCarro, marcaCarro, modeloCarro, corCarro,anoCarro,entradaCarro);

        //adicionando esse novo carro no array
        estacionamento.add(carro);

        //retornando uma mensagem de sucesso .... vocês podem melhorar essa parte do sistema criando talvez uma mensagem de erro caso aja problemas no cadastro de um novo carro
        System.out.println("Carro estacionado com sucesso!");
    }

    //esse método vai listar todos os carros que estão estacionados
    //vocês podem melhorar esse método colocando uma verificação quando não houver carros estacionados, vocês retornam a msg: Nenhum carro estacionado
    public static StringBuilder veiculosEstacionados() {
        //StringBuilder é só um esquema que o Java tem para criar uma "String composta"depois pesquisem, ou então façam algum esquema com string, tá fácil de fazer também
        StringBuilder retorno = new StringBuilder();

        //esse for ele percorre o array estacionamento da posição 0 até o último elemento de 1 em 1
        for(int i = 0; i<estacionamento.size(); i++){
            //a cada elemento encontrado ele constrói essa saída que nada mais é um texto formatado informando placa, modelo e cor
            retorno.append("=====================================================\n" + "Placa: ")
                    .append(estacionamento.get(i).getPlaca()).append("\n")
                    .append("Modelo: ").append(estacionamento.get(i).getModelo())
                    .append("\n").append("Cor: ").append(estacionamento.get(i).getCor()).append("\n")
                    .append("=====================================================\n");
        }

        return retorno;
    }

    //não sei porque vocês pensaram em remover veículos pois, ao meu ver o veículo dá entrada e só é removido quando sai do estacionamento. Mas mesmo assim implementei
    public static String removerVeiculo(String placa){
        //esse for ele percorre o array estacionamento da posição 0 até o último elemento de 1 em 1
        for(int i = 0; i<estacionamento.size(); i++){
            //se a placa digitada for igual a alguma placa de algum carro estacionado
            if(placa.equals(estacionamento.get(i).getPlaca())){
                //ele remove o carro e exibe a mensagem
                estacionamento.remove(i);
                return "O carro com a placa: " + estacionamento.get(i).getPlaca() + "foi removido!";
            } else {
                //caso nao encontre a placa digitada
                return "Nenhum carro com essa placa foi encontrado!";
            }
        }
        //caso o array ainda nao tenha recebido nenhum carro
        return "Não há nenhum carro estacionado";
    }

    //método criado para registrar a saída de carros
    public static String saidaDeVeiculo(String placa) {
        //esse for ele percorre o array estacionamento da posição 0 até o último elemento de 1 em 1
        for (int i = 0; i < estacionamento.size(); i++) {
            //se a placa digitada for igual a alguma placa de algum carro estacionado
            if (placa.equals(estacionamento.get(i).getPlaca())) {
                //pega a data e hora que o carro deu entrada no estacionamento (isso é feito no momento do cadastro do carro)
                LocalDateTime entrada = estacionamento.get(i).getEntrada();
                //pega a data e hora atual do sistema (pois quando você sai de um estacionamento o atendente nao digita a hora de saída e sim a hora atual)
                LocalDateTime saida = LocalDateTime.now();

                //calcula a diferença entre a entrada e saída
                Duration duration = Duration.between(entrada, saida);

                //deixa essa diferença em horas
                long diferenca = Math.abs(duration.toHours());

                //aqui é o valor da hora do estacionamento, voc6es podem alterar conforme a necessidade
                int valorHora = 15;

                //aqui ele remove o carro do array, pois se o carro deu saída, elee também tem que ser removido do estacionamento
                estacionamento.remove(i);

                //aqui exibe a mensagem
                return "O usuário ficou " + diferenca + "horas no estacionamento.\n" +
                        "Total a pagar: " + diferenca * valorHora;

            } else {
                //caso nao encontre a placa digitada
                return "Nenhum carro com essa placa foi encontrado!";
            }
        }
        //caso o array ainda nao tenha recebido nenhum carro
        return "Não há nenhum carro estacionado";
    }

    //esse método é apenas para converter a data e hora do cadastro para padrão brasileiro
    public static LocalDateTime converterDataHora(String dataHora){
        //esse é o padrão que desejamos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");

        //aqui ele pega a data e hora e converte para o padrao java para poder realizar os calculos anteriores
        return LocalDateTime.parse(dataHora, formatter);
    }
}
