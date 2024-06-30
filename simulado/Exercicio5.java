import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nota1, nota2, nota3, valorSaque, qtdNota1, qtdNota2, qtdNota3;
        nota1 = 10;
        nota2 = 20;
        nota3 = 50;
        System.out.printf("Cédulas Disponíveis:\n%d reais\n%d reais\n%d reais\n", nota1, nota2, nota3);
        System.out.println("Quanto deseja sacar?");
        valorSaque = in.nextInt();
        qtdNota3 = valorSaque / nota3;
        qtdNota2 = (valorSaque % nota3) / nota2;
        qtdNota1 = (valorSaque - (qtdNota3 * nota3) - (qtdNota2 * nota2)) / nota1;

        System.out.printf("%d notas de %d,00 reais \n%d notas de %d,00 reais\n%d notas de %d,00 reais", qtdNota3, nota3, qtdNota2, nota2, qtdNota1, nota1);

        in.close();
    }
}
