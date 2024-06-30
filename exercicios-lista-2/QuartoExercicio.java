import java.util.Scanner;
public class QuartoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
        deles é o maior, imprimindo na resposta o nome da variável e o seu valor.*/

        int valor1, valor2;
        System.out.println("informe dois valores");
        valor1 = in.nextInt();
        valor2 = in.nextInt();

        if (valor1 > valor2)
            System.out.println("O valor " + valor1 + " é o maior.");
        else if (valor1 < valor2)
            System.out.println("O valor " + valor2 + " é o maior");

        in.close();
    }
}
