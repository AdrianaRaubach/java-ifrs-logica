import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdFuncionarios = 0, cont = 0;
        float qtdHorasTrabalhadas = 0 ,valorHoraTrabalhada = 0, horasExtras = 0, salarioTotal = 0;

        System.out.println("Digite a quantidade de funcionários");
        qtdFuncionarios = in.nextInt();

        while(cont < qtdFuncionarios) {
            System.out.println("Digite o valor da hora trabalhada do funcionário " + (cont+1) + " e o total de horas realizadas na semana");
            valorHoraTrabalhada = in.nextFloat();
            qtdHorasTrabalhadas = in.nextFloat();
            if (qtdHorasTrabalhadas > 40f) {
                horasExtras = qtdHorasTrabalhadas - 40f;
                salarioTotal = ((qtdHorasTrabalhadas - horasExtras) * valorHoraTrabalhada) + (valorHoraTrabalhada * 1.5f) * horasExtras;
            } else {
                salarioTotal = qtdHorasTrabalhadas * valorHoraTrabalhada;
            }

            System.out.println("Salário " + salarioTotal);

            cont++;
        }

        in.close();
    }
}
