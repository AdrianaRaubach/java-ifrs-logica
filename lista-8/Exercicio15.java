import java.util.Scanner;
import java.util.Random;

public class Exercicio15 {
    public static void main(String[] args) {

        int[] v1 = new int[20];
        Scanner in = new Scanner(System.in);
        Random valoresVetor = new Random();

        for (int i = 0; i < v1.length; i++) {
            v1[i] = valoresVetor.nextInt(30);
        }

        System.out.println("Teste sua sorte, Digite um valor entre 0 e 30");
        int valorEscolhido = in.nextInt();
        int posicaoValorEscolhido = 100;

        for(int i = 0; i<v1.length; i++) {
            if (v1[i] == valorEscolhido)
                posicaoValorEscolhido = i;
        }

        if (posicaoValorEscolhido != 100) {
            System.out.println("O valor escolhido encontra-se na posição " + posicaoValorEscolhido + " do vetor");
            for(int i = 0; i<v1.length;i++) {
                System.out.print(v1[i] + " | ");
            }
        }else { 
            System.out.println("Este valor não foi encontrado no vetor");
        }

        in.close();

    }
}
