import java.util.Scanner;
import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        Random valorAleatorio = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha um elemento de 0 a 19");
        int elementoEscolhido = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valorAleatorio.nextInt(30);
            System.out.print(vetor[i] + " | ");
        }


        int maior = 0, menor = 0, igual = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[elementoEscolhido] == vetor[i]) {
                igual++;
            } else if (vetor[elementoEscolhido] > vetor[i]) {
                menor++;
            } else {
                maior++;
            }
        }

        igual = igual-1;

        System.out.println("\nValor do elemento escolhido " + vetor[elementoEscolhido] + "\n" +maior + " elementos maiores que o valor escolhido\n"+ menor + " elementos menores que o escolhido\n"+ igual + " elementos iguais ao escolhido");
    
        in.close();
    }
}
