import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float valor1, valor2, divisao;

        System.out.println("Informe dois valores");
        valor1 = in.nextFloat();
        valor2 = in.nextFloat();

        while (valor2 == 0) {
            System.out.println("O segundo valor não pode ser 0, digite outro valor");
            valor2 = in.nextFloat();
        }

        divisao = valor1/valor2;

        System.out.println("Divisão entre valor1 e valor2 = " + divisao);

        in.close();
        
    }
}
