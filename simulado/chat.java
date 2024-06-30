import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota1, nota2, notaOptativa, media;

        System.out.println("Digite a nota da primeira avaliação:");
        nota1 = in.nextFloat();

        System.out.println("Digite a nota da segunda avaliação:");
        nota2 = in.nextFloat();

        System.out.println("O aluno fez a avaliação optativa? (S/N):");
        String optativaFeita = in.next();

        if (optativaFeita.equalsIgnoreCase("S")) {
            System.out.println("Digite a nota da avaliação optativa:");
            notaOptativa = in.nextFloat();

            // Substituir a nota mais baixa entre nota1 e nota2 pela nota optativa
            if (nota1 < nota2) {
                nota1 = notaOptativa;
            } else {
                nota2 = notaOptativa;
            }
        } else {
            notaOptativa = -1; // Indica que o aluno não fez a avaliação optativa
        }

        // Calcular a média do semestre
        media = (nota1 + nota2) / 2;

        // Verificar o status do aluno
        if (media >= 6.0) {
            System.out.println("Média: " + media);
            System.out.println("Aluno aprovado.");
        } else if (media < 3.0) {
            System.out.println("Média: " + media);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Média: " + media);
            System.out.println("Aluno em exame.");
        }

        in.close();
    }
}
