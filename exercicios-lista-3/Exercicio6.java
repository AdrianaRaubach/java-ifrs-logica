import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*6. Ler o nome de dois times e o número de gols marcados na partida (para cada time).
Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
palavra EMPATE. */

        String time1, time2;
        int golsT1, golsT2;
        boolean empate;
        String situacao;

        System.out.println("Digite o nome dos times e em seguida o número de gols marcados respectivamente");
        time1 = in.next();
        time2 = in.next();
        golsT1 = in.nextInt();
        golsT2 = in.nextInt();

        empate = golsT1 == golsT2;
        if (empate) {
            situacao = "Empate";
        } else if (golsT1 > golsT2){
            situacao = "Time " + time1 + " venceu a partida";
        } else {
            situacao = "Time " + time2 + " venceu a partida";
        }

        System.out.println(situacao);
        in.close();
    }
}
