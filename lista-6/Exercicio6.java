import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fibonacci = 0;
        int precedente = 1;

        System.out.println("Digite um valor");
        int valorDigitado = in.nextInt();

        while (fibonacci < valorDigitado) {
           
            fibonacci = fibonacci + precedente;
            System.out.println(fibonacci);
            precedente = fibonacci - precedente;
        }

        in.close();

        }
    }

