import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        /*21. A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de
         * litros que deverá colocar no tanque de seu carro para que ele possa percorrer um
         * determinado número de voltas até o primeiro reabastecimento. Escreva um
         * algoritmo que leia o comprimento da pista (em metros), o número total de
         * voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e
         * o consumo de combustível do carro (em Km/L). Calcular e escrever o número
         * mínimo de litros necessários para percorrer até o primeiro reabastecimento.
         * Observação:
         * Considere que o número de voltas entre os reabastecimentos é o mesmo.*/
        Scanner in = new Scanner(System.in);
        float comprimentoPista, consumoCombustivel, minLitros;
        int totalVoltas, qtdReabastecimentos;
        System.out.println("Digite o comprimento da pista em metros, o total de voltas da corrida, a quantidade de reabastecimentos desejada e o consumo médio de combustível em Km/L");
        comprimentoPista = in.nextFloat() / 10f;
        totalVoltas = in.nextInt();
        qtdReabastecimentos = in.nextInt();
        consumoCombustivel = in.nextFloat();
        minLitros = (consumoCombustivel*comprimentoPista*totalVoltas) /qtdReabastecimentos;

        System.out.println("Mínimo necessário até o primeiro reabastecimento: " + minLitros);
        System.out.println(comprimentoPista);


        in.close();
    }
}
