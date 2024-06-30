/*Considere que você deseja uma comemoração especial para o seu aniversário e
assim irá convidar familiares a amigos para um churrasco na sua residência. Você
irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
de uma forma de calcular a quantidade certa a ser adquirida.
Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
consomem uma quantidades diferentes de carne.
Consumo de carne médio
(http://www.embaixadordochurrasco.com.br/calculochurrasco):
Homens: 400 gramas
Mulheres: 320 gramas
Crianças: 200 gramas
*Observação: geralmente é adicionada uma margem de segurança na quantidade
de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
de 20% no total de carne a ser adquirida */
import java.util.Scanner;
public class NonoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float consumoMedioHomens = 0.400f;
        float consumoMedioMulheres = 0.320f;
        float consumoMedioCriancas = 0.200f;

        System.out.println("Quantos homens confirmaram presença?");
        float qtdHomens = in.nextFloat();
        float consumoTotalHomens = consumoMedioHomens * qtdHomens;

        System.out.println("Quantas mulheres confirmaram presença?");
        float qtdMulheres = in.nextFloat();
        float consumoTotalMulheres = consumoMedioMulheres * qtdMulheres;

        System.out.println("Quantas crianças confirmaram presença?");
        float qtdCriancas = in.nextFloat();
        float consumoTotalCriancas = consumoMedioCriancas * qtdCriancas;

        float margemErro = (consumoTotalHomens + consumoTotalMulheres + consumoTotalCriancas) * (0.2f);

        System.out.printf("Considerando o total de pessoas e o consumo médio por cabeça, será necessário adquirir um total de " + (consumoTotalHomens + consumoTotalMulheres + consumoTotalCriancas + margemErro)+ " kg de carne sem osso.");
        
        in.close();
    }
}