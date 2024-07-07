import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int habitantesPaisA = 620000, habitantesPaisB = 650000, tempoAno = 0;
        float natalidadePaisA = 0.03f, natalidadePaisB = 0.02f;

        while (habitantesPaisB >= habitantesPaisA) {
            habitantesPaisA += habitantesPaisA * natalidadePaisA;
            habitantesPaisB += habitantesPaisB * natalidadePaisB;
            tempoAno++;
        }

        System.out.println("A população do país A ultrapassa a população B em " + tempoAno + " anos");
        System.out.println("Estimativa de habitantes país A: " + habitantesPaisA);
        System.out.println("Estimativa de habitantes país B: " + habitantesPaisB);
        in.close();

    }
}
