import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroInicial, numeroFinal, unidade, dezena, centena, milhar;
        System.out.println("Digite um valor entre 1000 e 9999");
        numeroInicial = in.nextInt();

        milhar = (numeroInicial % 10)*1000;
        centena = ((numeroInicial % 100)/10)*100;
        dezena = ((numeroInicial % 1000)/100)*10;
        unidade = numeroInicial / 1000;

        numeroFinal = milhar + centena + dezena + unidade;

        System.out.println("Dígitos invertidos: "+numeroFinal);

        in.close();
        
    }
}
