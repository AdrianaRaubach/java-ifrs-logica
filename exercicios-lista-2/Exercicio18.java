import java.util.Scanner;

public class Exercicio18 {
    /*
     * Uma revendedora de carros usados paga a seus funcionários vendedores um
     * salário
     * fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
     * do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o
     * número de
     * carros por ele vendidos, o valor total de suas vendas, o salário fixo e o
     * valor que ele
     * recebe por carro vendido. Calcule e escreva o salário final do vendedor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salarioFixo, comissaoPorCarro, porcentagemSobreVendas, valorTotalVendas, salarioFinal;
        int qtdCarrosVendidos;

        System.out.println(
                "Informe o número de carros vendidos, o valor total de suas vendas, seu salário fixo e o valor de sua comissão por carro vendido");
        qtdCarrosVendidos = in.nextInt();
        valorTotalVendas = in.nextFloat();
        salarioFixo = in.nextFloat();
        comissaoPorCarro = in.nextFloat();
        porcentagemSobreVendas = 0.05f;

        salarioFinal = (qtdCarrosVendidos * comissaoPorCarro) + (valorTotalVendas * porcentagemSobreVendas) + salarioFixo;

        System.out.println("Salário Final: " + salarioFinal);
        in.close();
    }
}
