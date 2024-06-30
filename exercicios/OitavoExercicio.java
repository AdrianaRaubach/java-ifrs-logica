/*Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
A entrada de dados será:
● Número total de eleitores;
● Número de votos válidos;
● Número de votos brancos;
● Número de votos nulos.
O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
relação ao total de eleitores):
● Percentual de votos válidos;
● Percentual de votos brancos;
● Percentual de votos nulos; */

import java.util.Scanner;
public class OitavoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        float totalEleitores;
        System.out.println("Qual o número total de eleitores?");
        totalEleitores = in.nextFloat();
        float votosValidos;
        System.out.println("Qual a quantidade de votos válidos?");
        votosValidos = in.nextFloat();
        float votosBranco;
        System.out.println("Qual a quantidade de votos em branco");
        votosBranco = in.nextFloat();
        float votosNulo;
        System.out.println("Qual a quantidade de votos nulos?");
        votosNulo = in.nextFloat();

        float percentualValidos = (votosValidos*100)/totalEleitores;
        float percentualBrancos = (votosBranco*100)/totalEleitores;
        float percentualNulos = (votosNulo*100)/totalEleitores;

        System.out.println("Foram registrados nesta eleição um total de " + percentualValidos+ "% de votos válidos, " + percentualBrancos + "% de votos em branco e " + percentualNulos + "% de votos nulos");

        in.close();

    }
    
}
