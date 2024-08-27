public class Exercicio9 {
    public static void main(String[] args) {

        int numero = 1000;
        int decimal = 0, milhar = 0, soma = 0;

        while (numero <= 9999) {
            decimal = numero %1000;
            milhar = (numero - decimal)/100;
            soma = milhar+decimal;

            if (soma * soma == numero) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
