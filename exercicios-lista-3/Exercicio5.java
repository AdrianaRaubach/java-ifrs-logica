import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        /*5. Ler três valores (A, B e C) representando as medidas dos lados de um triângulo e
escrever se formam ou não um triângulo. Observação: para formar um triângulo, o
valor de cada lado deve ser menor que a soma dos outros dois lados. */
        Scanner in = new Scanner(System.in);
        float l1, l2, l3;
        boolean ehUmTriangulo;
        String situacao;
        System.out.println("Digite as medidas dos 3 lados");
        l1 = in.nextFloat();
        l2 = in.nextFloat();
        l3 = in.nextFloat();

        ehUmTriangulo = l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2;

        if (ehUmTriangulo) {
            situacao = "É um triângulo";
        } else{
            situacao = "Não é um triângulo";
        }

        System.out.println(situacao);
        in.close();
    }
}
