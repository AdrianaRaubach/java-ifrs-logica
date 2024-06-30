import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        /*1. Ler um valor e escrever se é positivo, negativo ou zero */
        System.out.println("digite um valor inteiro");
        int valor = in.nextInt();
        boolean maiorQueZero, igualZero;
        maiorQueZero = valor > 0;
        igualZero = valor == 0;

        if (igualZero) {
            System.out.println("Este número é igual a zero");            
        } else if (maiorQueZero) {
            System.out.println("Este número é maior que zero");
        } else {
            System.out.println("Este número é menor que zero");
        }

        in.close();
    }
}