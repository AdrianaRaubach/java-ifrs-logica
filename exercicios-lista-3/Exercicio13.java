import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeProduto;
        int qtdAdquirida;
        float precoUnitario, desconto, valorFinal;

        System.out.println("Digite o nome do produto, a quantidade adquirida e o preço unitário");
        nomeProduto = in.next();
        qtdAdquirida = in.nextInt();
        precoUnitario = in.nextFloat();
        desconto = 0;

        if (qtdAdquirida <=5) {
            desconto = 0.02f;
        } else if (qtdAdquirida > 5 && qtdAdquirida <=10){
            desconto = 0.03f;
        } else if (qtdAdquirida > 10){
            desconto = 0.05f;
        }

        valorFinal = qtdAdquirida *precoUnitario - (qtdAdquirida *precoUnitario * desconto);

        System.out.printf("Produto: %s \nValor Final da compra R$ %.2f", nomeProduto, valorFinal);
        in.close();
    }
}
