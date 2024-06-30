/*Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
número digitado pelo usuário */

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Digite um número");
        number = in.nextInt();

        System.out.println(number - 1);
        
        in.close();
    }
}

