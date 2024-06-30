/* Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário
deverá digitar 4 informações de
entrada para o sistema, são elas:
- Valor de cada ingresso
- Número de pessoas (público do evento) que são sócias do clube
- Número de pessoas (público do evento) não pagantes (menores de 10
anos)
- Número de pessoas (público do evento) pagantes (sem desconto algum)
O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
e o valor que deixou de ser arrecadada devido aos descontos e isenções. */

import java.util.Scanner;
public class DecimoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorInteiro;
        System.out.println("Digite o valor do ingresso inteiro");
        valorInteiro = in.nextFloat();

        float descontoSocios = valorInteiro*0.3f;

        int publicoSocios;
        System.out.println("Quantos sócios estarão presentes no evento?");
        publicoSocios = in.nextInt();

        int publicoPaganteInteira;
        System.out.println("Quantos pagantes não associados estarão presentes no evento?");
        publicoPaganteInteira = in.nextInt();

        int publicoCriancas;
        System.out.println("Quantas crianças menores de 10 anos estarão presentes no evento?");
        publicoCriancas = in.nextInt();

        int publicoTotal = publicoSocios + publicoPaganteInteira + publicoCriancas;

        float valorArrecadado = (publicoPaganteInteira * valorInteiro) + (publicoSocios * (valorInteiro - descontoSocios));

        float valorDescontos = (publicoTotal * valorInteiro) - valorArrecadado;
        System.out.println("Valor Arrecadado: " + valorArrecadado + " reais");
        System.out.println("Valor Descontos: " + valorDescontos + " reais");

        in.close();
    }   
}