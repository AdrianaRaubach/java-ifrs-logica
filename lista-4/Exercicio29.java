import java.util.Scanner;

public class Exercicio29 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int unidade = 0, dezena = 0, centena = 1, pausa = 0;

        for (int i = 100; i <= 999; i++) {

            if (unidade > 9) {
                dezena++;
                unidade = 0;
            }
            if (dezena > 9) {
                centena++;
                dezena = 0;
            }
            System.out.print(i + " " + centena + "*" + dezena + "*" + unidade + " = ");
            System.out.println(centena * dezena * unidade);
            unidade++;

            if (pausa % 20 == 0 && pausa != 0) {
                System.out.println("\n Digite 1 para continuar");
                in.nextInt();
            }
            pausa++;

        }
        in.close();

        /*
         * 9. HARD - Escreva um programa que conte de 100 a 999 (inclusive) e exiba, um
         * por
         * linha, o produto dos três dıgitos dos números.
         * a. Desafio 1 - Faça seu programa dar uma pausa a cada 20 linhas para que
         * seja possível ver todos os números pouco a pouco. Solicite que seja
         * pressionada alguma tecla para ver a próxima sequência de números.Por
         * exemplo, inicialmente o programa irá exibir:
         * 100 (1*0*0)
         * 101 (1*0*1)
         * 102 (1*0*2)
         * (...)
         * 110 (1*1*0)
         * 111 (1*1*1)
         * 112 (1*1*2)
         * 999 (9*9*9) = 729
         */

    }
}