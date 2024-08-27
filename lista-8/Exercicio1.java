public class Exercicio1 {
    public static void main(String[] args) {
        /*Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura. */

        int sequencia [] = {1,2,3,4,5,6};

        for (int i = sequencia.length-1; i>= 0; i--) {
            System.out.println(sequencia[i]);
        }
    }
}