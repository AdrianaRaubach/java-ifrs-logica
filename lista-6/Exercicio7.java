import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome = "", sexo ="";
        float salario = 0f, maiorSalarioMasculino = 0f, maiorSalarioFeminino = 0f, salariomedioMasculino = 0f, salarioMedioFeminino = 0f;
        int qtdMulheres = 0, qtdHomens = 0;

        System.out.println("Qual a quantidade de funcionários?");
        int qtdFuncionarios = in.nextInt();
        
        for(int i = 0; i < qtdFuncionarios; i++) {
            System.out.println("Digite o nome do funcionário/a, seu gênero M/F, e seu salário");
            nome = in.next();
            sexo = in.next();
            salario = in.nextFloat();

            if (sexo.equals("M")) {
                salariomedioMasculino = salariomedioMasculino + salario;
                if (qtdHomens == 0 || salario > maiorSalarioMasculino) {
                    maiorSalarioMasculino = salario;
                }
                qtdHomens++;
            } else if (sexo.equals("F")) {
                salarioMedioFeminino = salarioMedioFeminino + salario;
                if (qtdMulheres == 0 || salario > maiorSalarioFeminino) {
                    maiorSalarioFeminino = salario;
                }
                qtdMulheres++;
            } else {
                System.out.println("Gênero inválido, tente novamente");
                i--;
            }
        }

        salarioMedioFeminino = salarioMedioFeminino / qtdMulheres;
        salariomedioMasculino = salariomedioMasculino / qtdHomens;

        System.out.printf("Maior salário Masculino R$ %.2f\nMaior salário Feminino R$ %.2f\nSalário Médio Masculino R$ %.2f\nSalário Médio Feminino R$ %.2f" , maiorSalarioMasculino, maiorSalarioFeminino, salariomedioMasculino, salarioMedioFeminino);

        in.close();
    }
}
