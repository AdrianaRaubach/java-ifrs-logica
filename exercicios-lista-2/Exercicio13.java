import java.util.Scanner;
public class Exercicio13 {   
    /*. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
(considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
a média calculada.*/
    public static void main(String[] args) {     
        Scanner in = new Scanner(System.in);
        float n1, n2, mediaDesejada, mediaAluno;
        mediaDesejada = 6f;
        boolean condicaoAprovacao;
        
        System.out.println("Informe as 2 notas");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        mediaAluno = (n1+n2)/2;
        condicaoAprovacao = mediaAluno >= mediaDesejada;

        if (condicaoAprovacao) {
            System.out.println("Aluno Aprovado com média: " + mediaAluno);
        } else {
            System.out.println("Aluno Reprovado com média: " + mediaAluno);
        }


        in.close();
    }
}
