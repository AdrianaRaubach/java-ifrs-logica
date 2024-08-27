import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] votos = new int[5];
        int voto = 0;
        String[] candidatos = { "Bob", "Patrick", "Sandy", "Cirigueijo", "Lula" };
        String candidatoMaisVotado = "";
        int qtdVotosVencedor = 0;

        while (voto != -1) {
            System.out.println(
                    "Digite 1 para votar em Bob, 2 para votar em Patrick, 3 para votar em Sandy, 4 para votar e Cirigueijo e 5 para votar em Lula");
            voto = in.nextInt();
            switch (voto) {
                case 1:
                    votos[0]++;
                    break;

                case 2:
                    votos[1]++;
                    break;

                case 3:
                    votos[2]++;
                    break;

                case 4:
                    votos[3]++;
                    break;

                case 5:
                    votos[4]++;
                    break;
            }

            for (int i = 0; i < votos.length; i++) {

                if (i == 0 || votos[i] > qtdVotosVencedor) {
                    candidatoMaisVotado = candidatos[i];
                    qtdVotosVencedor = votos[i];
                }
            }

        }

        System.out.println(candidatoMaisVotado + " venceu com " + qtdVotosVencedor + " votos.");

        in.close();
    }
}
