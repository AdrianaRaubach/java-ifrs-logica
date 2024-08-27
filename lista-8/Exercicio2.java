import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random sorteador = new Random();

        System.out.println("Quantas vezer quer rolar o dado");
        int qtdDeTestes = in.nextInt();
        int l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0;

        for (int i = 1; i <= qtdDeTestes; i++) {
            int numeroAleatorio = sorteador.nextInt(6) + 1;
            System.out.println("Teste " + i + ": " + numeroAleatorio);

            switch (numeroAleatorio) {
                case 1:
                    l1++;
                    break;
                case 2:
                    l2++;
                    break;
                case 3:
                    l3++;
                    break;
                case 4:
                    l4++;
                    break;
                case 5:
                    l5++;
                    break;
                case 6:
                    l6++;
                    break;
            }
        }

        System.out.printf(
                "lado 1 caiu: %d vezes\nlado 2 caiu: %d vezes\nlado 3 caiu %d vezes\nlado 4 caiu %d vezes\nlado 5 caiu %d vezes\nlado 6 caiu %d vezes\n",
                l1, l2, l3, l4, l5, l6);

        in.close();
    }
}
