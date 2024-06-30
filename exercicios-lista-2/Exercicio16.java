import java.util.Scanner;
public class Exercicio16 {
    /*16. Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
concedido. Nenhum dos valores informados pode ser zero ou negativo.
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario, valorPrestacao, limitePrestacao, valorEmprestimo;
        int qtdPrestacao;
        boolean condicaoEmprestimo;

        System.out.println("Informe seu salário, o valor desejado e o número de prestações desejadas");
        salario = in.nextFloat();
        valorEmprestimo = in.nextFloat();
        qtdPrestacao = in.nextInt();
        valorPrestacao = valorEmprestimo / qtdPrestacao;
        limitePrestacao = salario * 0.3f;
        condicaoEmprestimo = valorPrestacao <= limitePrestacao;

        if (condicaoEmprestimo) {
            System.out.println("Emprestimo Contratado com sucesso. \n O valor da sua prestação ficou em: R$" + valorPrestacao);
        } else {
            System.out.println("Empréstimo negado. \nO valor da sua parcela deve ser inferior a R$" + limitePrestacao + "\ntente com um maior número de parcelas");
        }


        in.close();
    }
    
}
