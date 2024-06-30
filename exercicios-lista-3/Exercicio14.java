import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        String conceito;

        System.out.println("Digite as notas das 3 avaliações");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();
        conceito = "X";

        media = (nota1 + nota2 + nota3)/3f;

        if (media >= 9){
            conceito = "A";
        } else if (media < 9 && media >= 7.5){
            conceito = "B";
        } else if (media < 7.5 && media >= 6){
            conceito = "C";
        } else if (media < 6){
            conceito = "D";
        }

        System.out.println("Conceito: " + conceito);
        in.close();
    }
}
