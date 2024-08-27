public class Exercicio12 {
    public static void main(String[] args) {

        int [] idades = {12,11,18,24,23,5,9,33,6,1};

        int qtsMaiorDeIdade = 0, qtdMenorDeIdade = 0;

        for(int i = 0 ; i < idades.length; i++) {
            if (idades[i] >= 18) {
                qtsMaiorDeIdade++;
            } else {
                qtdMenorDeIdade++;
            }
        }

        System.out.println("Maiores de idade: " + qtsMaiorDeIdade + "\nMenores de idade: " + qtdMenorDeIdade);
    }
}
