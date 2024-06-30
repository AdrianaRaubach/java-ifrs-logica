import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /*23. Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
quantidade média, usando a seguinte fórmula: ((quantidade média = quantidade
máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
quantidade média escrever a mensagem “Não efetuar compra”, senão escrever a
mensagem “Efetuar compra”. */
        Scanner in = new Scanner(System.in);
        int estAtual, estMin, estMax, qtdMedia;
        System.out.println("Digite o estoque atual, o estoque minimo e o máximo do produto");
        estAtual = in.nextInt();
        estMin = in.nextInt();
        estMax = in.nextInt();
        qtdMedia = (estMax + estMin) / 2;
        boolean condicao = estAtual >= qtdMedia;

        if (condicao) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        in.close();
}
}
