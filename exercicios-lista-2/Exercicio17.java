import java.util.Scanner;
public class Exercicio17 {
    /*17. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
custo final ao consumidor.
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float percentualDistribuidor, percentualImpostos, custoFabrica, custoFinal;
        System.out.println("Informe o custo de fábrica do veículo");
        custoFabrica = in.nextFloat();
        percentualDistribuidor = custoFabrica * 0.28f;
        percentualImpostos = custoFabrica * 0.45f;
        custoFinal = custoFabrica + percentualDistribuidor + percentualImpostos;

        System.out.println("Custo Final: " + custoFinal);

        in.close();
    }
}
