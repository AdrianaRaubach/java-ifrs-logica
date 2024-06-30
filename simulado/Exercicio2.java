import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float custoFabrica, impostos, percentualDistribuidor, custoFinal;
        // final float CUSTO_DISTRIBUIDOR = 0.28f  -- declarar constante
        System.out.println("Digite o custo de fábrica");
        custoFabrica = in.nextFloat();
        impostos = 0.45f;
        percentualDistribuidor = 0.28f;
        custoFinal = custoFabrica + (custoFabrica * impostos) + (custoFabrica * percentualDistribuidor);
        System.out.printf("Custo Final: R$ %.2f.", custoFinal);

        in.close();

    }
}
