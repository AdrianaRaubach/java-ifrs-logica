import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade = 0;

        do {
            System.out.println("Digite uma idade válida");
            idade = in.nextInt();

        } while(!(idade >= 0 && idade <= 150));

        System.out.println("Idade: " + idade);

        in.close();
    }
}
