public class Exercicio4 {
    public static void main(String[] args) {

        int [] valores = {5,4,5,4,7,8,8,9,7,3,15,21,33,66};
        int contPares = 0, contImpares = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        int [] valoresPares = new int[contPares];
        int [] valoresImpares = new int[contImpares];

        int posicaoVetorPar = 0, posicaoVetorImpar = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                valoresPares[posicaoVetorPar] = valores[i];
                posicaoVetorPar++;
            } else {
                valoresImpares[posicaoVetorImpar] = valores[i];
                posicaoVetorImpar++;
            }
        }

        for (int i = 0; i< valoresPares.length; i++) {
            System.out.println("Vetor par: " + valoresPares[i]);
        }

        for (int i = 0; i< valoresImpares.length; i++) {
            System.out.println("Vetor impar: " + valoresImpares[i]);
        }
    }
}
