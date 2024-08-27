public class Desafio {
    public static void main(String[] args) {
        int[] v1 = { 1, 3, 5, 7, 9 };
        int[] v2 = { 2, 4, 6, 8, 10 };

        int v3[] = new int[v1.length + v2.length];
        int varAux = 0;

        for (int i = 0; i < v3.length; i++) {
            for (int j = 0; j < v1.length; j++) {
                v3[j] = v1[j];
                v3[j + v1.length] = v2[j];
            }
        }

        for (int i = 0; i < v3.length; i++) {
            for (int j = i; j < v3.length; j++) {
                if (v3[i] > v3[j]) {
                    varAux = v3[i];
                    v3[i] = v3[j];
                    v3[j] = varAux;
                }
            }
        }

        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " | ");
        }
    }
}
