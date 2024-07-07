import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mediaImpar = 0, mediaPar = 0, menorImpar = 0, maiorPar = 0, valor = 1, contPar = 0, contImpar = 0;

        while (valor > 0) {
            System.out.println("Digite um valor, para encerrar o programa digite um número negativo");
            valor = in.nextInt();

            if (valor < 0) {
                break;
            }

            if (valor % 2 == 0) {
                if (contPar == 0)
                    maiorPar = valor;
                if (valor > maiorPar)
                    maiorPar = valor;
                mediaPar = mediaPar + valor;
                contPar++;

            } else {
                if (contImpar == 0)
                    menorImpar = valor;
                if (valor < menorImpar)
                    menorImpar = valor;
                mediaImpar = mediaImpar + valor;
                contImpar++;
            }
        }

        mediaImpar = mediaImpar/contImpar;
        mediaPar = mediaPar/contPar;

        System.out.printf("Média numeros ímpares: %d \nMédia números pares: %d \nMenor número ímpar: %d \nMaior número par: %d", mediaImpar, mediaPar, menorImpar, maiorPar);
        in.close();

        System.out.println("\nPrograma encerrado");
        

    }
}
