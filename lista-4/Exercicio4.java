import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String opcao;
        float saldo = 0f;

        do {
            System.out.println("Opções\n (a) para saldo \n (b) para saque\n (c) para depósito \n (d) para sair");
            opcao = in.nextLine();
            if (opcao.equals("a")) {
                System.out.println("Saldo: " + saldo);
            } else if (opcao.equals("b")) {
                System.out.println("Quanto deseja sacar");
                float valor = Float.parseFloat(in.nextLine());
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao.equals("c")) {
                System.out.println("Quanto deseja depositar");
                float valor = Float.parseFloat(in.nextLine());
                saldo = saldo + valor;
                System.out.println("Saldo atual: " + saldo);
            }
        } while (!opcao.equals("d"));

        in.close();
    }
}
