import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String naipeC1Jg1, naipeC2Jg1, naipeC1Jg2, naipeC2Jg2;
        int carta1Jg1, carta2Jg1, carta1Jg2, carta2Jg2, pontosJg1, pontosJg2;
        pontosJg1 = 0;
        pontosJg2 = 0;

        System.out.println("Digite os naipes do JG 1 - O/P/C/E");
        naipeC1Jg1 = in.next();
        naipeC2Jg1 = in.next();
        System.out.println("Digite o valor das cartas do JG 1 - 1 a 13");
        carta1Jg1 = in.nextInt();
        carta2Jg1 = in.nextInt();

        System.out.println("Digite os naipes do JG 2 - O/P/C/E");
        naipeC1Jg2 = in.next();
        naipeC2Jg2 = in.next();
        System.out.println("Digite o valor das cartas do JG 2 - 1 a 13");
        carta1Jg2 = in.nextInt();
        carta2Jg2 = in.nextInt();

        boolean sequenciaisDeMesmoNaipe, sequenciaisDeNaipeDiferente, naoSequenciaisDeMesmoNaipe,
                naoSequenciaisDeNaipeDiferente, numerosIguais, sequenciaisDeMesmoNaipeJg2,
                sequenciaisDeNaipeDiferenteJg2, naoSequenciaisDeMesmoNaipeJg2, naoSequenciaisDeNaipeDiferenteJg2,
                numerosIguaisJg2;

        sequenciaisDeMesmoNaipe = naipeC1Jg1.equals(naipeC2Jg1) && carta1Jg1 == carta2Jg1 + 1
                || naipeC1Jg1.equals(naipeC2Jg1) && carta1Jg1 == carta2Jg1 - 1;
        sequenciaisDeNaipeDiferente = (!naipeC1Jg1.equals(naipeC2Jg1)) && carta1Jg1 == carta2Jg1 + 1
                || (!naipeC1Jg1.equals(naipeC2Jg1)) && carta1Jg1 == carta2Jg1 - 1;
        naoSequenciaisDeMesmoNaipe = naipeC1Jg1.equals(naipeC2Jg1) && carta1Jg1 != carta2Jg1 + 1
                || naipeC1Jg1.equals(naipeC2Jg1) && carta1Jg1 != carta2Jg1 - 1;
        naoSequenciaisDeNaipeDiferente = (!naipeC1Jg1.equals(naipeC2Jg1)) && carta1Jg1 != carta2Jg1 + 1
                || (!naipeC1Jg1.equals(naipeC2Jg1)) && carta1Jg1 != carta2Jg1 - 1;
        numerosIguais = carta1Jg1 == carta2Jg1;

        sequenciaisDeMesmoNaipeJg2 = naipeC1Jg2.equals(naipeC2Jg2) && carta1Jg2 == carta2Jg2 + 1
                || naipeC1Jg2.equals(naipeC2Jg2) && carta1Jg2 == carta2Jg2 - 1;
        sequenciaisDeNaipeDiferenteJg2 = (!naipeC1Jg2.equals(naipeC2Jg2)) && carta1Jg2 == carta2Jg2 + 1
                || (!naipeC1Jg2.equals(naipeC2Jg2)) && carta1Jg2 == carta2Jg2 - 1;
        naoSequenciaisDeMesmoNaipeJg2 = naipeC1Jg2.equals(naipeC2Jg2) && carta1Jg2 != carta2Jg2 + 1
                || naipeC1Jg2.equals(naipeC2Jg2) && carta1Jg2 != carta2Jg2 - 1;
        naoSequenciaisDeNaipeDiferenteJg2 = (!naipeC1Jg2.equals(naipeC2Jg2)) && carta1Jg2 != carta2Jg2 + 1
                || (!naipeC1Jg2.equals(naipeC2Jg2)) && carta1Jg2 != carta2Jg2 - 1;
        numerosIguaisJg2 = carta1Jg2 == carta2Jg2;

        if (numerosIguais) {
            pontosJg1 = (carta1Jg1 + carta2Jg1) * (carta1Jg1 + carta2Jg1);
            System.out.println("Pontos JG1: " + pontosJg1);
        } else if (sequenciaisDeMesmoNaipe) {
            pontosJg1 = carta1Jg1 * carta2Jg1;
            System.out.println("Pontos JG1: " + pontosJg1);
        } else if (sequenciaisDeNaipeDiferente) {
            pontosJg1 = carta1Jg1 + carta2Jg1;
            System.out.println("Pontos JG1: " + pontosJg1);
        } else if (naoSequenciaisDeMesmoNaipe) {
            if (carta1Jg1 > carta2Jg1) {
                pontosJg1 = carta1Jg1;
                System.out.println("Pontos JG1: " + pontosJg1);
            } else {
                pontosJg1 = carta2Jg1;
                System.out.println("Pontos JG1: " + pontosJg1);
            }
        } else if (naoSequenciaisDeNaipeDiferente) {
            if (carta1Jg1 > carta2Jg1) {
                pontosJg1 = carta1Jg1 - carta2Jg1;
                System.out.println("Pontos JG1: " + pontosJg1);
            } else {
                pontosJg1 = carta2Jg1 - carta1Jg1;
                System.out.println("Pontos JG1: " + pontosJg1);
            }
        }
        if (numerosIguaisJg2) {
            pontosJg2 = (carta1Jg2 + carta2Jg2) * (carta1Jg2 + carta2Jg2);
            System.out.println("Pontos JG2: " + pontosJg2);
        } else if (sequenciaisDeMesmoNaipeJg2) {
            pontosJg2 = carta1Jg2 * carta2Jg2;
            System.out.println("Pontos JG2: " + pontosJg2);
        } else if (sequenciaisDeNaipeDiferenteJg2) {
            pontosJg2 = carta1Jg2 + carta2Jg2;
            System.out.println("Pontos JG2: " + pontosJg2);
        } else if (naoSequenciaisDeMesmoNaipeJg2) {
            if (carta1Jg2 > carta2Jg2) {
                pontosJg2 = carta1Jg2;
                System.out.println("Pontos JG2: " + pontosJg2);
            } else {
                pontosJg2 = carta2Jg2;
                System.out.println("Pontos JG2: " + pontosJg2);
            }
        } else if (naoSequenciaisDeNaipeDiferenteJg2) {
            if (carta1Jg2 > carta2Jg2) {
                pontosJg2 = carta1Jg2 - carta2Jg2;
                System.out.println("Pontos JG2: " + pontosJg2);
            } else {
                pontosJg2 = carta2Jg2 - carta1Jg2;
                System.out.println("Pontos JG2: " + pontosJg2);
            }
        }

        if (pontosJg1 > pontosJg2) {
            System.out.println("Jogador 1 Venceu a rodada");
        } else {
            System.out.println("Jogador 2 Venceu a rodada");
        }

        in.close();

    }
}
