import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int senha = 12345;
        int senhaDigitada = 0;
        int cont = 1;

        while (senha != senhaDigitada) {
            System.out.println("Digite a senha correta:");
            senhaDigitada = in.nextInt();
            if (senha != senhaDigitada) {
                System.out.println("Senha incorreta, tentativa " + cont);
            }

            cont++;
        }

        System.out.println("Acesso liberado");

        in.close();

    }
}
