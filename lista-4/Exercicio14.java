import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cont = 0, valorDigitado = 0, contEntre1E10 = 0, contMultiplicador = 0;
        float multiplicação = 1, soma = 0;

        while (cont < 10) {
            System.out.println("Digite um valor");
            valorDigitado = in.nextInt();
            if (valorDigitado >= 1 && valorDigitado <= 10) {
                contEntre1E10++;
            }
            if (valorDigitado >= 0 && valorDigitado <= 10) {
                multiplicação = multiplicação * valorDigitado;
                contMultiplicador++;
            } else {
                soma = soma + valorDigitado;
            }

            cont++;
        }
        if(contMultiplicador == 0)
            multiplicação = 0;

        System.out.println("Foram digitados " + contEntre1E10 + " números entre 1 e 10");
        System.out.println("A multiplicação dos números entre 0 e 10 é: " + multiplicação);
        System.out.println("A soma entre dos números abaixo de 0 e acima de 10 é " + soma);


        in.close();
    }
}
