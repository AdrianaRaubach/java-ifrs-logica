import java.util.Scanner;
public class SetimoExercicio {
    /*7. Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês e qual será seu salário atual. Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.
a. Pergunte ao usuário qual a % de imposto que é descontada do salário. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu salário por hora (R$), quantidade de horas trabalhadas até o momento, a quantidade de horas trabalhadas no mês e a porcentagem descontada de imposto");
        float salarioHora = in.nextFloat();
        float horasTrabalhadas = in.nextFloat();
        float horasTrabalhadasMes = in.nextFloat();
        float imposto = in.nextFloat();
        float saldoSalarioAtual = salarioHora * horasTrabalhadas;
        float salarioMensal = salarioHora * horasTrabalhadasMes;
        float salarioLiquidoAtual = saldoSalarioAtual - (saldoSalarioAtual*imposto/100);
        float salarioLiquidoMensal = salarioMensal- (salarioMensal*imposto/100);

        System.out.println("Saldo de salário atual, sem considerar impostos: " + saldoSalarioAtual);
        System.out.println("Saldo de salário atual, considerando impostos: " + salarioLiquidoAtual);
        System.out.println("Salário mensal, sem considerar impostos: " + salarioMensal);
        System.out.println("Salário Líquido mensal, considerando impostos: " + salarioLiquidoMensal);

        in.close();
    }
    
}
