import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        /*
         * 20. Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
         * Sabendo-se que o preço do combustível é de R$ 4.599, escreva um algoritmo
         * para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final
         * do dia,o número de litros de combustível gasto e o valor total (R$) recebido dos
         * passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.
         */
        Scanner in = new Scanner(System.in);
        float marcacaoOdometroInicial, marcacaoOdometroFinal, litrosGastos, valorRecebido, consumoMedio, lucroLiquido, precoCombustivel;
        System.out.println("Digite as seguintes informações, Marcação odometro do início do dia, marcação odometro final do dia, litros de combustível gastos, valor arrecadado no dia");
        precoCombustivel = 4.599f;
        marcacaoOdometroInicial = in.nextFloat();
        marcacaoOdometroFinal = in.nextFloat();
        litrosGastos = in.nextFloat();
        valorRecebido = in.nextFloat();
        consumoMedio = (marcacaoOdometroFinal - marcacaoOdometroInicial)/litrosGastos;
        lucroLiquido = valorRecebido - (litrosGastos * precoCombustivel);

        System.out.println("Media de consumo Km/L: " + consumoMedio + "\nLucro Líquido do dia: " + lucroLiquido);
        in.close();
    }
}
