public class Exercicio30 {
    public static void main(String args[]){
        int numerador, denominador, n;
        float resultadoDenominador, resultado, somaSerie;
        numerador = 1;
        denominador = 1;
        n = 10;
        somaSerie = 0;

        for(int i = 0; i < n; i++) { 
            resultadoDenominador = 1;
            for (int fatorial = 1; fatorial <= denominador; fatorial++){
                resultadoDenominador = resultadoDenominador * fatorial;
            }
            resultado = numerador / resultadoDenominador;
            System.out.printf("%d/%d! = %f\n",numerador, denominador,resultado);
            somaSerie = somaSerie + resultado;

            numerador++;
            denominador = denominador + 2;
        }

        System.out.println("Soma da série: " + somaSerie);
    }

}
