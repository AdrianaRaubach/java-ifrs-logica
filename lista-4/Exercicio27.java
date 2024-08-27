import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, n, dobro, soma;

        System.out.println("Digite um valor inteiro e o valor de n");
        valor = in.nextInt();
        n = in.nextInt();
        dobro = 0;
        soma = 0;

        for (int i =0; dobro<100000 && soma<100000 && i < n; i++) {
            dobro = valor*2;
            soma = soma + dobro;
            System.out.println("Dobro = " + dobro + " Soma com antecessor = "+soma);
            valor = dobro;
        }
        in.close();
        
    }
}