import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota, menorNota, media;
        int cont;
        nota = 0; menorNota = 0; media = 0; cont = 0;

        while (cont < 3) {
            System.out.println("Digite a nota da avaliação " + (cont+1));
            nota = in.nextFloat();
            if (cont == 0) {
                menorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
            
            media += nota;
            cont++;            
        }

        media = (media - menorNota) / 2;

        System.out.println("Média entre as duas maiores notas " + media);

        in.close();
    }
}
