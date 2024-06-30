import java.util.Scanner;
public class Exercicio3 {
    /*Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = in.nextInt();
        String primo = "primo";
        int cont = 2;

        while(numero > cont && numero % cont != 0) {
            primo = "primo";
            cont++;
        }

        while(numero > cont && numero % cont == 0) {
            primo = "não é primo";
            cont++;
        }

        System.out.println(primo);



        in.close();

    }
}

