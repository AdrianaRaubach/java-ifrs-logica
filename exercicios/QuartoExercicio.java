/*Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
triângulo.
A = (Base * altura) /2*/

import java.util.Scanner;
public class QuartoExercicio{
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        int baseTriangulo;
        System.out.println("Qual a Base do Triângulo?");
        baseTriangulo = in.nextInt();

        int alturaTriangulo;
        System.out.println("Qual a Altura do Triângulo?");
        alturaTriangulo = in.nextInt();

        System.out.println("A área total do Triângulo informado é "+ (baseTriangulo*alturaTriangulo)/2);

        in.close();
    }
}

