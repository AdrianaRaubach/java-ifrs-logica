import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado, entre 1 e 20:");
        int lado = in.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("Tamanho inválido! Digite um número entre 1 e 20.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}
