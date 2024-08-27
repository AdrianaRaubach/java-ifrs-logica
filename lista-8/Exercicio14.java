import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
         * Crie um vetor com 10 números e, dentro de um laço de repetição permita que o
         * usuário escolha duas posições e troque o valor destas posições. A cada troca
         * o
         * programa deve mostrar o vetor em questão.
         */
        Scanner in = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        while (true) {
            System.out.println("\nDigite duas posições para trocar");
            int pos1 = in.nextInt();
            int pos2 = in.nextInt();

            if(pos1 == -1 || pos2 == -1)
                break;

            if (pos1 >= 0 && pos1 < 10 && pos2 >= 0 && pos2 < 10) {
                int aux = vetor[pos1];
                vetor[pos1] = vetor[pos2];
                vetor[pos2] = aux;

                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " | ");
                }
            } else {
                System.out.println("Posição inválida, digite valores entre 0 e 9");
            }
        }
        in.close();

    }
}
