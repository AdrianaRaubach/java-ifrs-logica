import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        /*11. Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
do lado (em cm). Calcular e imprimir o seguinte:
- Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
perímetro.
- Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
- Se o número de lados for igual a 5 escrever PENTÁGONO.
Observação: Considere que o usuário só informará os valores 3, 4 ou 5. */
        Scanner in = new Scanner(System.in);
        int numeroLados, medidaLado;
        System.out.println("Digite o número de lados e a medida do lado em cm");
        numeroLados = in.nextInt();
        medidaLado = in.nextInt();
    
        if (numeroLados == 3){
            System.out.println("Triângulo de perímetro " + medidaLado*3);
        } else if (numeroLados == 4){
            System.out.println("Quadrado de perímetro " + medidaLado*4);
        } else if (numeroLados ==5){
            System.out.println("Pentagono de perímetro " + medidaLado*5);
        } else if (numeroLados < 3){
            System.out.println("Não é um polígono");
        } else if (numeroLados > 5){
            System.out.println("polígono não identificado");
        }
        in.close();

    }
}
