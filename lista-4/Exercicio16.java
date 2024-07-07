import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero = 1, potencia = 1, resultadoPotencia =1, cont = 1;
        System.out.println("Digite o numero e sua potencia");

        numero = in.nextInt();
        potencia = in.nextInt();

        while (cont < potencia) {
            if (cont == 1) {
                resultadoPotencia = numero * numero;    
            } else {
                resultadoPotencia = resultadoPotencia * numero;
            }
            
            cont++;
        }

        System.out.println("resultado = " + resultadoPotencia);

        in.close();
    }
}
