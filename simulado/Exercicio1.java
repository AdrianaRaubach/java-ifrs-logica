import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        float valorIngresso, descontoSocios, rendaTotal, descontosTotal;
        int sociosQtd, pagantesIntQtd, naoPagantesQtd, publicoTotal;

        System.out.println("Digite a quantidade de sócios, não sócios pagantes e crianças");
        sociosQtd = in.nextInt();
        pagantesIntQtd = in.nextInt();
        naoPagantesQtd = in.nextInt();
        System.out.println("Digite o valor do ingresso");
        valorIngresso = in.nextFloat();
        descontoSocios = 0.7f;

        publicoTotal = sociosQtd + pagantesIntQtd + naoPagantesQtd;
        rendaTotal = (pagantesIntQtd * valorIngresso) + (sociosQtd * descontoSocios *valorIngresso);
        descontosTotal = publicoTotal * valorIngresso - rendaTotal;

        System.out.printf("Público Total: %d pessoas \nRenda Total: %.2f reais\nTotal de descontos: %.2f reais", publicoTotal, rendaTotal, descontosTotal);

        in.close();
    }
}