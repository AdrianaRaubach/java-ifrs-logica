public class Exercicio10 {
    public static void main(String[] args) {

        int[] v1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] v2 = new int[10];

        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j <= i; j++) {
                v2[i] += v1[j];
            }
        }

        System.out.print("[ ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println("]");
    }
}
