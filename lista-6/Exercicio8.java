import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valorInteiroPositivo  = 0, valorAnterior = Integer.MAX_VALUE/2;

        for (int i = 0;valorInteiroPositivo <= 2*valorAnterior; i++) {

            if(i>0)
            valorAnterior = valorInteiroPositivo;

            System.out.println("Digite um valor inteiro positivo");
            valorInteiroPositivo = in.nextInt();

            if (valorInteiroPositivo < 0) {
                System.out.println("Valor inválido, digite um valor inteiro positivo");
                valorInteiroPositivo = in.nextInt();
            }
        }

        System.out.println("Valor anterior: "+ valorAnterior + "\nValor inteiro maior que o dobro do anterior: " + valorInteiroPositivo);

        in.close();
    }
}
