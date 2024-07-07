import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor = 0;

        do {
            System.out.println("Digite um valor");
            valor = in.nextInt();
            System.out.println("Valor: " + valor);
        }
        while(!(valor >= 1 && valor <= 10));

        in.close();
    }
}
