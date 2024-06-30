import java.util.Scanner;
public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
        float valor;

        System.out.println("informe um valor");
        valor = in.nextFloat();

        if (valor >= 0)
            System.out.println("Este numero é positivo");
        else if (valor < 0)
            System.out.println("Este número é negativo");

        in.close();
    }
}
