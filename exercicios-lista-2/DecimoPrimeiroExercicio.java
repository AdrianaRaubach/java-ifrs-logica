import java.util.Scanner;
public class DecimoPrimeiroExercicio {
    /*
     * . Faça um programa que receba dois números e efetua a adição. Caso o valor
     * somado seja maior que 20, este deverá ser apresentado somando-se a ele 8;
     * caso
     * o valor somado seja menor ou igual a 20, este deverá ser apresentado
     * subtraindo-se
     * 10.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float v1, v2, adicao, soma, subtracao;
        boolean condicao;

        System.out.println("Informe dois valores");
        v1 = in.nextFloat();
        v2 = in.nextFloat();

        adicao = v1 + v2;
        soma = adicao + 8f;
        subtracao = adicao - 10f;
        condicao = adicao > 20;

        if (condicao) {
            System.out.println(soma);
        } else {
            System.out.println(subtracao);
        }

        in.close();
    }
}
