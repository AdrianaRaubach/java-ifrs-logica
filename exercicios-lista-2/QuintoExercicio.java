import java.util.Scanner;
public class QuintoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
        eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
        mensagem de erro.*/

        int valor1, valor2, resultado;
        System.out.println("digite 2 valores");
        valor1 = in.nextInt();
        valor2 = in.nextInt();
        resultado = valor1 / valor2;

        if (valor2 != 0) 
            System.out.println("Resultado: " + resultado);

        else if (valor2 == 0)
            System.out.println("O denominador não pode ser igual a zero");
        
        in.close();
    }
}
