import java.util.Scanner;

public class OitavoExercicio {
    /*
     * Escreva um algoritmo para ler o número total de eleitores de um município, o
     * número de votos brancos, nulos e válidos. Calcular e escrever o percentual
     * que
     * cada um representa em relação ao total de eleitores
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEleitores, votosBrancos, votosNulo, votosValidos;
        float percentualValidos, percentualBrancos, percentualNulos;
        System.out.println("Digite a quantidade de eleitores, votos brancos, voltos nulos e votos validos");
        totalEleitores = in.nextInt();
        votosBrancos = in.nextInt();
        votosNulo = in.nextInt();
        votosValidos = in.nextInt();

        percentualBrancos = votosBrancos * 100f / totalEleitores;
        percentualNulos = votosNulo * 100f / totalEleitores;
        percentualValidos = votosValidos * 100f / totalEleitores;

        System.out.println("Percentual Brancos: " + formatarPercentual(percentualBrancos));
        System.out.println("Percentual Nulos: " + formatarPercentual(percentualNulos));
        System.out.println("Percentual Válidos: " + formatarPercentual(percentualValidos));

        in.close();
    }

    private static String formatarPercentual(float percentual) {
        // Utilizando String.format para formatar com 2 casas decimais
        return String.format("%.2f%%", percentual);
    }

}
