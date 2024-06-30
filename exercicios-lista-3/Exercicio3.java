import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        /*3. Ler três valores (considere que não serão informados valores iguais) e escrever a
        soma dos dois maiores */
        Scanner in = new Scanner(System.in);
        int var1, var2, var3;
        System.out.println("Digite 3 valores");
        var1 = in.nextInt();
        var2 = in.nextInt();
        var3 = in.nextInt();
        in.close();

        boolean condicao1, condicao2, condicao3;
        condicao1 = var1 > var3 && var2 > var3;
        condicao2 = var2 > var1 && var3 > var1;
        condicao3 = var1 > var2 && var3 > var2;

        if (condicao1) {
            System.out.println("var1 + var2 = \n" + (var1 + var2));
        } else if (condicao2) {
            System.out.println("var2 + var3 = \n" + (var2 + var3));
        } else if (condicao3) {
            System.out.println("var1 + var3 = \n" + (var1 + var3));
        }
        
    }
}
