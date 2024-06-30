import java.util.Scanner;
public class Exercicio7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tipoCombustivel;
        float valorAlcool, valorGasolina, litrosVendidos, valorFinal;
        float desconto;
        valorAlcool = 3.9f;
        valorGasolina = 4.3f;
        valorFinal = 0;
        System.out.println("Digite o tipo do combustível A/G e a quantidade desejada em litros");
        tipoCombustivel = in.next();
        litrosVendidos = in.nextFloat();

        if (tipoCombustivel.equals("A")) {
            if (litrosVendidos <= 20f) {
                desconto = 0.03f;
                valorFinal = litrosVendidos *(valorAlcool - valorAlcool*desconto);
            } else {
                desconto = 0.05f;
                valorFinal = litrosVendidos *(valorAlcool - valorAlcool*desconto);
            }
        } else if (tipoCombustivel.equals("G")){
            if (litrosVendidos <=20 ){
                desconto = 0.04f;
                valorFinal = litrosVendidos *(valorGasolina - valorGasolina*desconto);
            } else {
                desconto = 0.06f;
                valorFinal = litrosVendidos *(valorGasolina - valorGasolina*desconto);
            }
        } else {
            System.out.println("Você deve digitar um tipo de combustível válido A ou G");
        }

        System.out.printf("Valor final: %.2f", valorFinal);

        in.close();
    }
}