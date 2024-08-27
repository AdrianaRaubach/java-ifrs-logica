import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String candidatoVencedor = "Canditado vencedor: ";
        String numeroCandidatoVencedor = "\nNúmero: ";
        int votosC1, votosC2, votosC3, votosBranco, votosNulo, qtdEleitores, voto;
        votosC1 = 0;
        votosC2 = 0;
        votosC3 = 0;
        votosBranco = 0;
        votosNulo = 0;
        qtdEleitores = 0;
        voto = 0;

        while (voto != -1) {
            System.out.println("Digite o número do seu candidato");
            voto = in.nextInt();
            if (voto == -1)
                break;

            if (voto == 24666) {
                votosC1++;
                System.out.println("Voto computado para Alberto");
            } else if (voto == 55442) {
                votosC2++;
                System.out.println("Voto computado para Roberto");
            } else if (voto == 42424) {
                votosC3++;
                System.out.println("Voto computado para Gilberto");
            } else if (voto == 00) {
                votosNulo++;
                System.out.println("Voto nulo");
            } else if (voto == 99) {
                votosBranco++; 
                System.out.println("Voto branco");
            } else {
                System.out.println("Não localizamos nenhum candidato com esta identificação, digite um número válido");
                qtdEleitores--;
            }

            qtdEleitores++;
        }

        if (votosC1 > votosC2 && votosC1 > votosC3) {
            candidatoVencedor = candidatoVencedor + "Alberto";
            numeroCandidatoVencedor = numeroCandidatoVencedor + "24666";
        } else if (votosC2 > votosC1 && votosC2 > votosC3) {
            candidatoVencedor = candidatoVencedor + "Roberto";
            numeroCandidatoVencedor = numeroCandidatoVencedor + "55442";
        } else if (votosC2 > votosC1 && votosC2 > votosC3) {
            candidatoVencedor = candidatoVencedor + "Gilberto";
            numeroCandidatoVencedor = numeroCandidatoVencedor + "42424";
        }

        System.out.println(candidatoVencedor + numeroCandidatoVencedor);
        System.out.printf("Total de eleitores: %s\nVotos Branco: %s\nVotos Nulo: %s", qtdEleitores, votosBranco, votosNulo);
        
        in.close();
           
    }
}
