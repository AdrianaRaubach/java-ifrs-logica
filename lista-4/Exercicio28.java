import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor = 1;
        int valorDigitado = 1;

        while (valorDigitado > 0) {
            System.out.println("\nQual valor deseja sacar?");
            valorDigitado = in.nextInt();
            valor = valorDigitado;

            if (valor>=200) {
                int qtdnota200 = valor/200;
                System.out.println(qtdnota200+ " cédula de R$200,00");
                valor = valor%200;
            } 
            if (valor>=100) {
                int qtdnota100 = valor/100;
                System.out.println(qtdnota100+ " cédula de R$100,00");
                valor = valor%100;
            } 
            if (valor>=50) {
                int qtdnota50 = valor/50;
                System.out.println(qtdnota50+ " cédula de R$50,00");
                valor = valor%50;
            } 
            if (valor>=20) {
                int qtdnota20 = valor/20;
                System.out.println(qtdnota20+ " cédula de R$20,00");
                valor = valor%20;
            } 
            if (valor>=10) {
                int qtdnota10 = valor/10;
                System.out.println(qtdnota10+ " cédula de R$10,00");
                valor = valor%10;
            } 
            if (valor == 5 || valor == 7 || valor == 9) {
                int qtdnota5 = valor/5;
                System.out.println(qtdnota5 + " cédula de R$5,00");
                valor = valor%5;
            }
    
            if (valor>=2) {
                int qtdnota2 = valor/2;
                System.out.println(qtdnota2+ " cédula de R$2,00");
                valor = valor%2;
            }
            if (valor == 1) {
                System.out.println("Este caixa não possui cédulas de 1 real");
            }
        }
        in.close();

    }
}
