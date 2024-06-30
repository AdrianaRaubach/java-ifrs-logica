import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
        /*
         * 22. Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
         * crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito +
         * crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem
         * “Saldo Positivo”, senão escrever a mensagem “Saldo Negativo”.
         */
        Scanner in = new Scanner(System.in);
        int numConta;
        float saldo, debito, credito, saldoAtual;
        System.out.println("Digite o número da sua conta, o saldo inicial, débitos e creditos");
        numConta = in.nextInt();
        saldo = in.nextFloat();
        debito = in.nextFloat();
        credito = in.nextFloat();
        saldoAtual = saldo - debito + credito;
        boolean condicao;
        condicao = saldoAtual >= 0;

        if (condicao) {
            System.out.println("Conta: " + numConta + "\nSaldo Atual: " + saldoAtual + "\nSaldo Positivo");
        } else {
            System.out.println("Conta: " + numConta + "\nSaldo Atual: " + saldoAtual + "\nSaldo Negativo");
        }

        in.close();

    }

}
