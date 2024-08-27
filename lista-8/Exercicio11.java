import java.util.Scanner;
import java.util.Random;
public class Exercicio11 {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       Random valoresAleatoriosVetor = new Random();

       System.out.println("Qual o tamanho do vetor?");
       int tamanhoVetor = in.nextInt();
       int [] v1 = new int [tamanhoVetor];
       int [] v2 = new int [tamanhoVetor];
       int [] v3 = new int [tamanhoVetor];

       for(int i = 0; i < v1.length; i++) {
            v1[i] = valoresAleatoriosVetor.nextInt(100);
            v2[i] = valoresAleatoriosVetor.nextInt(100);
            v3[i] = v1[i] + v2[i];
       }

       System.out.println("\nVetor 1");
       for(int i = 0; i < v1.length; i++) {
           System.out.print(v1[i] + " | ");
       }

       System.out.println("\nVetor 2");
       for(int i = 0; i < v2.length; i++) {
           System.out.print(v2[i] + " | ");
       }

       System.out.println("\nVetor 1 + Vetor 2");
       for(int i = 0; i < v3.length; i++) {
           System.out.print(v3[i] + " | ");
       }
       in.close();
    }
}
