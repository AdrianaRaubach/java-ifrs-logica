import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int posicao1 = 0, posicao2 = 0;

        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        do {
            System.out.println("Digite duas posições");
            posicao1 = in.nextInt();
            posicao2 = in.nextInt();

            if (posicao1 == -1 || posicao2 == -1) {
                break;
            }
            if (posicao1 >= vetor.length || posicao1 < 0 || posicao2 >= vetor.length || posicao2 < 0) {
                System.out.println("Posição inválida, digite valores entre 0 e 11");
            } else {
                int soma = vetor[posicao1] + vetor[posicao2];
                System.out.println("Soma: " + soma);
            }

        } while (true);

        in.close();
    }
}
