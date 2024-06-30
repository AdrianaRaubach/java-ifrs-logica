import java.util.Scanner;
public class NonoExercicio {
    public static void main(String[] args) {
        /*Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
        mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692 = d=2.r  p= d.pi  a=pi.r2*/
        Scanner in = new Scanner(System.in);
        float pi, raio, diametro, perimetro, area;

        pi = 3.141692f;
        System.out.println("Digite o raio do círculo em centímetros");
        raio = in.nextFloat();
        diametro = 2f * raio;
        perimetro = diametro * pi;
        area = pi * (raio *raio);

        System.out.println("Diametro: " + diametro + " cm");
        System.out.println("Comprimento/perimetro: " + perimetro + " cm");
        System.out.println("Área: " + area + " cm2");

        in.close();
    }
    
}
