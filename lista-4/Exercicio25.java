import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor = 1, cont = 0;

        while (valor > 0) {
            System.out.println("Digite um valor");
            valor = in.nextInt();
            cont = 0;

            while ((cont * cont) <= valor) {

                cont++;
            }
            cont = cont - 1;

            if (valor > 0) {

                if (cont * cont != valor) {
                    System.out.println("O número informado não é um quadrado perfeito");
                } else {
                    System.out.println("O número informado é um quadrado perfeito");
                }
            }

            in.close();

        }
    }
}