import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        float altura, pesoIdeal;
        int genero;
        System.out.println("Digite sua altura e seu genero 1 para feminino e 2 para masculino");
        altura = in.nextFloat();
        genero = in.nextInt();
        pesoIdeal = 0;

        if (genero == 1){
            pesoIdeal = (62.1f * altura) - 44.7f;
        } else if (genero == 2){
            pesoIdeal = (72.7f * altura) -58f;
        } else {
            System.out.println("Digite um gênero válido, /1 = feminino/ ou /2 = masculino/");
        }
        
        System.out.printf("Peso ideal: %.2f kg. ", pesoIdeal);

        in.close();
    }
}
