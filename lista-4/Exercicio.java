import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        /*Ler um número inteiro n. Escrever a soma de todos os números de 1 até n */
        Scanner in = new Scanner(System.in);

        int nInt = 0;
        int cont = 0, soma = 0;

        System.out.println("Digite um número inteiro");
        nInt = in.nextInt();
        
        while (cont <= nInt) {
            soma = soma + cont;
            cont ++;
        }

        System.out.println("Soma: " + soma);

        in.close();

    }
}