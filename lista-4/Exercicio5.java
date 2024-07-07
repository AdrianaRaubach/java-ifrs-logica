import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota, media, cont;
        nota = 0;
        media = 0;
        cont = 0;

        while(cont < 5) {
            System.out.println("Digite a nota: ");
            nota = in.nextFloat();
            media += nota;
            cont++;
        }

        media = media/5f;

        System.out.println("Média: " + media);

        in.close();
        
    }
}
