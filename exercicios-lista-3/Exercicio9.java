import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float av1, av2, avOpt, media;
        String situacao;
        System.out.println("Informe as notas av1, av2 e optativa, caso não tenha feito optativa digite -1");
        av1 = in.nextFloat();
        av2 = in.nextFloat();
        avOpt = in.nextFloat();

        if (avOpt == -1f) {
            media = (av1 + av2) / 2f;
        } else {
            if (av1 > av2) {
                media = (av1 + avOpt) / 2f;
            } else {
                media = (av2 + avOpt) / 2f;
            }
        }
    
        if (media >= 6) {
            situacao = "APROVADO";
        } else if (media >= 3) {
            situacao = "EXAME";
        } else {
            situacao = "REPROVADO";
        }
        System.out.printf("Média: %.2f \nSituação: %s", media, situacao);
        in.close();
    }
}
