/*Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
média da viagem, informe o tempo que uma família levará saindo de sua cidade de
férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
calculado. t=d/v
 */
import java.util.Scanner;
public class SetimoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float d;
        System.out.println("Digite a distancia que será percorrida em kilometros");
        d = in.nextFloat();
        float v;
        System.out.println("Digite a velocidade média prevista para a viagem em Km/h");
        v = in.nextFloat();
        float t = d/v;

        System.out.println("O tempo médio calculado para sua viagem é de aproximadamente " + t + " horas. Boa viagem!");

        in.close();
    }
    
}
