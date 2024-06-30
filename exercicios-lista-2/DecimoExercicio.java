import java.util.Scanner;

public class DecimoExercicio {
    /*
     * Faça um programa que receba a idade de um nadador e classifique-o numa das
     * seguintes categorias:
     * • Adulto (idade >= 18);
     * • Juvenil (idade >= 14 e idade < 18);
     * • Infantil (idade >=9 e idade < 14);
     * • Mirim (Idade < 9).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        boolean adulto, juvenil, infantil, mirim;
        System.out.println("informe sua idade");
        idade = in.nextInt();

        adulto = idade >= 18;
        juvenil = idade >= 14 && idade < 18;
        infantil = idade >=9 && idade < 14;
        mirim = idade < 9;

        if (mirim){
            System.out.println("Categoria Mirim");
        } if (infantil) {
            System.out.println("Categoria Infantil");
        } if (juvenil) {
            System.out.println("Categoria Juvenil");
        } if (adulto) {
            System.out.println("Categoria Adulto");
        }

        in.close();
    }
}
