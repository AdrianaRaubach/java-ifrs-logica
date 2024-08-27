import java.util.Scanner;
public class Exercicio2 {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);
        int numeroDigitado = 0;
        String repetir = "s";
        String inteirosPares = "";

        while (repetir.equals("s")){
            inteirosPares = "";
            System.out.println("Digite um número inteiro positivo");
            numeroDigitado = in.nextInt();

            if (numeroDigitado < 1) {
                System.out.println("Número inválido");
                
            }
            if (numeroDigitado > 0) {
                for(int i = 2; i<=numeroDigitado; i = i+2){
                    inteirosPares = inteirosPares + " " + i;
                }
                System.out.println("Números inteiros pares entre 1 e " + numeroDigitado + ": " + inteirosPares);
            }
            System.out.println("Deseja informar um outro número (s/n)?");
            repetir = in.next();

        }

        System.out.println("Programa encerrado");
        in.close();
    }
}