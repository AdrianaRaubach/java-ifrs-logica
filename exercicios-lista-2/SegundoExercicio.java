import java.util.Scanner;
public class SegundoExercicio {
    public static void main(String[] args) {
        //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
        //calcular e escrever a área e o perímetro do retângulo.
        Scanner in = new Scanner(System.in);
        float base, altura, area, perimetro;

        System.out.println("digite a base e altura em cm");
        base = in.nextFloat();
        altura = in.nextFloat();
        
        area = base * altura;
        perimetro = 2f*(base+altura);
        
        System.out.println("area " + area + " cm2 " + "petrimetro " + perimetro + " cm");

        in.close();
    }
}
