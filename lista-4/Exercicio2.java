import java.util.Scanner;
public class Exercicio2 {
    /*2. Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inteiro, somaPares, cont;
        somaPares = 0;
        cont = 0;

        System.out.println("Digite um número inteiro");
        inteiro = in.nextInt();

        while (cont <= inteiro) {
            if (cont % 2 == 0) {
                somaPares = somaPares + cont;
            }
            cont ++;
        }

        System.out.println("Soma: "+ somaPares);

        in.close();

    }
}
