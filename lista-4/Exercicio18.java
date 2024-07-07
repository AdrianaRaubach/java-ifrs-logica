import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade = 1, numeroPessoas = 0, idadeMedia = 0, menorIdade = 0, maiorIdade = 0;

        while(idade != 0) {
            System.out.println("Digite a idade:  /para ver o resultado digite 0/");
            idade = in.nextInt();
            if (idade == 0 ) {
                break;
            }
            idadeMedia += idade;
            if (numeroPessoas == 0) {
                menorIdade = idade;
                maiorIdade = idade;
            }
            if (idade < menorIdade){
                menorIdade = idade;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            }

            numeroPessoas++;

        };

        idadeMedia = idadeMedia / numeroPessoas;
        System.out.println("Maior idade informada " + maiorIdade);
        System.out.println("Menor idade informada " + menorIdade);
        System.out.println("Total de pessoas " + numeroPessoas);
        System.out.println("Idade média de todas as pessoas "+ idadeMedia);

        in.close();
    }
}
