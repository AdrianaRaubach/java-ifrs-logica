import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        /*25. Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
um cofrinho que contenha:
♦ N moedas de 1 real;
♦ N moedas de 50 centavos;
♦ N moedas de 25 centavos;
♦ N moedas de 10 centavos;
♦ N moedas de 5 centavos;
O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
para a compra o produto X */
        Scanner in= new Scanner(System.in);
        float valorProduto, valorTotalCofrinho;
        int moedas1real, moedas50cent, moedas25cent, moedas10cent, moedas5cent;
        System.out.println("Digite o valor do produto");
        valorProduto = in.nextFloat();
        System.out.println("Digite quantas moedas de 1 real, 50 centavos, 25 centavos, 10 centavos e 5 centavos respectivamente: ");
        moedas1real = in.nextInt();
        moedas50cent = in.nextInt();
        moedas25cent = in.nextInt();
        moedas10cent = in.nextInt();
        moedas5cent = in.nextInt();
        valorTotalCofrinho = moedas1real + (moedas50cent * 0.5f) + (moedas25cent * 0.25f) + (moedas10cent * 0.1f) + (moedas5cent * 0.5f);
        boolean condicao = valorTotalCofrinho >= valorProduto;

        if (condicao) {
            System.out.println("Seu cofrinho possui R$" + valorTotalCofrinho + "\n Valor suficiente para adquirir o produto desejado");
            
        } else {
            System.out.println("Valor insuficiente \nFaltam R$" + (valorProduto - valorTotalCofrinho) + " para adquirir o produto");
        }


        in.close();
    }
}
