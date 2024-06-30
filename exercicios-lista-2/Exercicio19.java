import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        /*
         * 19. Escreva um algoritmo para ler as dimensões de uma cozinha retangular
         * (comprimento, largura e altura), calcular e escrever a quantidade de caixas
         * de azulejos para se colocar em todas as suas paredes (considere que não será
         * descontada a área ocupada por portas e janelas). Cada caixa de azulejos
         * possui 1.5 m2.
         */
        Scanner in = new Scanner(System.in);
        float altura, largura, comprimento, cadaCaixa, qtdCaixasNecessarias;
        System.out.println("Informe a altura, largura e comprimento em metros: ");
        altura = in.nextFloat();
        largura = in.nextFloat();
        comprimento = in.nextFloat();
        cadaCaixa = 1.5f;
        qtdCaixasNecessarias = ((comprimento + largura)* altura) / cadaCaixa;
        int intQtdCaixas = (int) qtdCaixasNecessarias;

        System.out.println("Serão necessárias: "+ intQtdCaixas + " caixas");


        in.close();
    }

}
