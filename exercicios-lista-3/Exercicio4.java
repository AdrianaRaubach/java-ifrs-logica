import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        /*4. Ler três valores (considere que não serão informados valores iguais) e escrevê-los
em ordem crescente. */
        Scanner in = new Scanner(System.in);
        int var1, var2, var3;
        System.out.println("Digite 3 valores");
        var1 = in.nextInt();
        var2 = in.nextInt();
        var3 = in.nextInt();
        in.close();

        boolean condicao1, condicao2, condicao3, condicao4, condicao5, condicao6;
        condicao1 = var1 > var2 && var2 > var3;
        condicao2 = var2 > var1 && var1 > var3;
        condicao3 = var3 > var1 && var1 > var2;
        condicao4 = var1 > var3 && var3 > var2;
        condicao5 = var2 > var3 && var3 > var1;
        condicao6 = var3 > var2 && var2 > var1;

        if (condicao1) {
            System.out.println("Ordem crescente:\n" + var3 + var2 + var1);
        } else if (condicao2) {
            System.out.println("Ordem crescente:\n" + var3 + var1+ var2);
        } else if (condicao3) {
            System.out.println("Ordem crescente:\n" + var2 + var1 + var3);
        } else if (condicao4) {
            System.out.println("Ordem crescente:\n" + var2 + var3 + var1);
        } else if (condicao5) {
            System.out.println("Ordem crescente:\n" + var1 + var3 + var2);
        } else if (condicao6) {
            System.out.println("Ordem crescente:\n" + var1 + var2 + var3);
        }

        System.out.println();
    }
}
