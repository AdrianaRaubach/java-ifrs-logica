import java.util.Scanner;
public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Faça um algoritmo que converta metros para centímetros. Lembrando que 1m em 100cm
        float metros, centimetros;
        System.out.println("Digite a distancia em metros");
        metros = in.nextFloat();
        centimetros = metros*100f;
        System.out.println("O resultado é: " + centimetros);
        in.close();
    }
}
