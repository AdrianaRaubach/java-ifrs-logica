import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float massa, perdaMassaACada30Segundos= 0.25f, tempoEmSegundos = 0f;

        System.out.println("Digite a massa");
        massa = in.nextFloat();

        while (massa >= 0.10f) {
            massa -= massa*perdaMassaACada30Segundos;
            tempoEmSegundos += 30f;            
            System.out.println(tempoEmSegundos + " massa: " + massa);
        }

        in.close();
        System.out.println("A massa deste material atinge uma quantidade menor que 0,10 grama em " + tempoEmSegundos + " segundos");
    }
}
