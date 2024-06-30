import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /* 2. Ler três valores (considere que não serão informados valores iguais) e
         * escrever o maior deles.*/
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 valores");
        int var1, var2, var3;
        var1 = in.nextInt();
        var2 = in.nextInt();
        var3 = in.nextInt();

        if (var1 > var2 && var1 > var3){
            System.out.println("Maior valor: " + var1);
        } else if ( var2 > var1 && var2 > var3) {
            System.out.println("Maior valor: " + var2);
        } else {
            System.out.println("Maior valor: " + var3);
        }

        in.close();

    }
}
