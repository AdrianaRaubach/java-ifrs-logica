/*Desenvolva o algoritmo de um programa para calcular a média de duas notas das
avaliações de um aluno. */
import java.util.Scanner;
public class SextoExercicio {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        float nota1;
        
        System.out.println("Informe a nota da primeira avaliação");
        nota1 = in.nextFloat();

        float nota2;     
        System.out.println("Informe a nota da segunda avaliação");
        nota2 = in.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.println("A nota média atingida pelo Aluno é "+ media +" pontos");

        in.close();
    }
    
}
