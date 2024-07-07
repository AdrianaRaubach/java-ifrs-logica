import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mercadorias = 0, totalMercadorias = 0, cont = 1;
        float valorUnitarioMercadorias = 0, valorTotalMercadorias = 0, mediaValores = 0;

            System.out.println("Digite a quantidade total de mercadorias em estoque");
            totalMercadorias = in.nextInt();

        do {
            System.out.println("Digite quantas unidades tem do item " + cont + " e o valor unitário deste item respectivamente");
            mercadorias = in.nextInt();
            valorUnitarioMercadorias = in.nextFloat();
            mediaValores += valorUnitarioMercadorias; 
            valorTotalMercadorias += mercadorias * valorUnitarioMercadorias;
            cont++;

        } while (cont <= totalMercadorias);

        mediaValores = mediaValores / totalMercadorias;

        System.out.println("Valor médio das mercadorias R$ " + mediaValores);
        System.out.println("Valor total em estoque R$ "+ valorTotalMercadorias);

        in.close();

    }
}
