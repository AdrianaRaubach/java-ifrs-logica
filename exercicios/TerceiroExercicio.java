/*3. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir quadrado do número informado pelo
usuário.
 */
import java.util.Scanner;
public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero = input.nextInt();
        System.out.println("O quadrado do número "+numero+" é "+numero*numero);

        input.close();
    }
}
