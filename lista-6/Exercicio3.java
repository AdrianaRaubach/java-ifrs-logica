import java.util.Scanner;
public class Exercicio3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float peso = 1, altura = 1, imc = 1;
        int contObesidadeGrau3 = 0, contObesidadeGrau2 = 0, contObesidadeGrau1 = 0, contSobrepeso = 0, contPesoNormal = 0, contAbaixoDoPeso = 0;

        for(int i = 1; altura != 0; i++) {
            System.out.println("Digite o peso e a altura da pessoa " + i);
            peso = in.nextFloat();
            altura = in.nextFloat();
            if (altura == 0) {
                break;
            }
            imc = peso / (altura * altura);

            System.out.println("pessoa" +i + " "+ imc);

            if (imc >= 40) {
                contObesidadeGrau3++;
            } else if (imc >= 35) {
                contObesidadeGrau2++;
            } else if (imc >= 30) {
                contObesidadeGrau1++;
            } else if (imc >= 25) {
                contSobrepeso++;
            } else if (imc >= 18.5) {
                contPesoNormal++;
            } else {
                contAbaixoDoPeso++;
            }

        }
        System.out.printf("Abaixo do peso: %d%nPeso normal: %d%nSobrepeso: %d%nObesidade Grau I: %d%nObesidade Grau II: %d%nObesidade Grau III: %d%n", contAbaixoDoPeso,contPesoNormal,contSobrepeso,contObesidadeGrau1,contObesidadeGrau2,contObesidadeGrau3);

        in.close();
    }
}
