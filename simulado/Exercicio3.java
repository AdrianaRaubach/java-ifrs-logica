import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fezOptativa;
        float nota1, nota2, notaOptativa, media;

        System.out.println("Digite as notas 1, 2");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        System.out.println("O aluno fez a optativa? Reponda S ou N");
        fezOptativa = in.next();

        if (fezOptativa.equals("S")) {
            System.out.println("Digite a nota da optativa");
            notaOptativa = in.nextFloat();
            if (nota1 > nota2) {
                nota2 = notaOptativa;
            } else {
                nota1 = notaOptativa;
            }
        } else if (fezOptativa.equals("N")) {
            if (nota1 > nota2) {
                notaOptativa = -1f;
                nota2 = notaOptativa;
            } else {
                notaOptativa = -1f;
                nota1 = notaOptativa;
        }
    }

        media = (nota1 + nota2)/2f;

        boolean aprovado, reprovado, exame;
        aprovado = media >= 6.0;
        reprovado = media < 3.0;
        exame = media >= 3.0 && media < 6.0;

        System.out.println(media);

        if (aprovado) {
            System.out.println("Aluno aprovado");
        } else if (exame) {
            System.out.println("Aluno em exame");
        } else if (reprovado) {
            System.out.println("Aluno reprovado");   
        }   
        in.close();
    }
}
