import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {
    
        Random valoresParaVetor = new Random();        
        int [] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valoresParaVetor.nextInt(90)+10;
            System.out.print(vetor[i] + " | " );
        }
        System.out.println();

        int conteudo = 0;

        for(int i = 0; i < vetor.length-10; i++) {
            conteudo = vetor[i];
            vetor[i] = vetor[i+10];
            vetor[i+10] = conteudo;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | " );
        }

    }
}
