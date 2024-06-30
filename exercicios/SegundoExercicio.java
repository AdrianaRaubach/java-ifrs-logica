/*O algoritmo deve ter como entrada um número real e a saída deve ser o valor
atualizado com os 20%.*/
import java.util.Scanner;
public class SegundoExercicio{
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero");
        numero = in.nextInt();
        System.out.println(numero+(numero*0.2));

        in.close();
    }

}

