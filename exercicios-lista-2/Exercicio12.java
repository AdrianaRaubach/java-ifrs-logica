import java.util.Scanner;
public class Exercicio12 {
    /*As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
de maçãs compradas, calcule e escreva o custo total da compra. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidade;
        float valorInteiro, valorDesconto;
        boolean condicaoDesconto;

        System.out.println("Quantidade de maças a serem compradas");
        quantidade = in.nextInt();
        valorInteiro = 1.5f * quantidade;
        valorDesconto = 1.3f * quantidade;
        condicaoDesconto = quantidade >= 12;
        in.close();

        if (condicaoDesconto) {
            System.out.println("Valor Total: " + valorDesconto);
        } else {
            System.out.println("Valor Total: " + valorInteiro);
        }
    }
}
