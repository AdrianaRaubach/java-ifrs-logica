import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0, fibonacci = 1, antecessor = 0;

        System.out.println("Informe um número");
        numero = in.nextInt();

        while (fibonacci < numero) {
           
            fibonacci = fibonacci + antecessor;
            System.out.println(fibonacci);
            antecessor = fibonacci - antecessor;
        }

        in.close();
    }
}
