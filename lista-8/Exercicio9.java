import java.util.Scanner;
import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random sortearArray = new Random();

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sortearArray.nextInt(10);
        }

        int[] array2 = new int[5];
        int valorDigitado = 0, cont = 0;

        while (cont < array2.length) {
            System.out.println("Digite um valor");
            valorDigitado = in.nextInt();

            for (int a = 0; a < array.length; a++) {
                if (valorDigitado == array[a]) {
                    array2[a] = valorDigitado;
                    cont++;
                }
            }

            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " | ");
            }
        }

        System.out.println("Você acertou todos os valores do array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }

        in.close();
    }
}
