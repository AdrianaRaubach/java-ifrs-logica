/*Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
graus Celsius.
A fórmula para conversão é a seguinte:
C/5 = F-32/9
Onde:
C = temperatura em graus Celsius;
F = temperatura em graus Fahrenheit.
 */

import java.util.Scanner;
public class QuintoExercicio {
    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);
        int tempFahrenheit;
        System.out.println("Qual a temperatura em Fahrenheit?");
        tempFahrenheit = in.nextInt();

        int tempCelsius;
        tempCelsius = ((tempFahrenheit-32)*5)/9;

        System.out.println("A temperatura informada convertida para Celsius é "+ tempCelsius);

        in.close();
        
    }
}
