import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = in.nextInt();

        while (valor % 5 != 0 || valor == 0) {
            System.out.println("Este valor não é multiplo de 5, tente novamente");
            valor = in.nextInt();
        }

        System.out.println("Valor múltiplo de 5: " + valor);

        in.close();

    }
}
