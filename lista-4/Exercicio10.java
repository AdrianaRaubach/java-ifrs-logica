import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float salario = 0;

        do {
            System.out.println("Digite um salário válido");
            salario = in.nextInt();

        } while (!(salario >= 1250 && salario <= 10000));

        System.out.println("Salário válido: " + salario);

        in.close();
    }
}