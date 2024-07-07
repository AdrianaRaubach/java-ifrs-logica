import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero, cont = 2;
        System.out.println("Digite um número");
        numero = in.nextInt();
        String resultado = "Número Primo";

        while (cont < numero) {
            if (numero % cont == 0) {
                resultado = "Não é Primo";
            } 
            cont++;
        }

        System.out.println(resultado);



        in.close();
    }
}
