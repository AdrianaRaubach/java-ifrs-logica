import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int matricula = 1, idade = 0;
        float altura = 0f, alturaMediaHomensComMenosDe40Anos = 0f;
        String sexo = "M/F", concursado = "S/N";
        int contConcursados$as = 0, contconcursadas = 0, contHomens = 0, idadeHomemConcursadoMaisVelho = 0,
                qtdMulheresMaisde30AnosSemConcurso = 0, contHomensComMenosDe40Anos = 0;

        while (matricula != 0) {
            System.out.println(
                    "Digite o número de sua matrícula, sua idade, sua altura, seu sexo (M/F) e se é concursado (S/N)");
            matricula = in.nextInt();
            if (matricula == 0)
                break;
            idade = in.nextInt();
            altura = in.nextFloat();
            sexo = in.next();
            concursado = in.next();

            if (concursado.equals("S")) {
                contConcursados$as++;
                if (sexo.equals("F")) {
                    contconcursadas++;
                }
                if (sexo.equals("M")) {
                    if (idade > idadeHomemConcursadoMaisVelho) {
                        idadeHomemConcursadoMaisVelho = idade;
                    }
                }
            }

            if (sexo.equals("M")) {
                contHomens++;
                if (idade < 40) {
                    alturaMediaHomensComMenosDe40Anos = alturaMediaHomensComMenosDe40Anos + altura;
                    contHomensComMenosDe40Anos++;
                }
            } else {
                if (idade > 30 && concursado.equals("N")) {
                    qtdMulheresMaisde30AnosSemConcurso++;
                }
            }
        }

        alturaMediaHomensComMenosDe40Anos = alturaMediaHomensComMenosDe40Anos / contHomensComMenosDe40Anos;


        System.out.println("a) o número de funcionárias concursadas: "+ contconcursadas +
                "\nb) o número de funcionários (somente homens): "+ contHomens +
                "\nc) a maior idade dos homens concursados: " + idadeHomemConcursadoMaisVelho +
                "\nd) a quantidade de mulheres com mais de 30 anos sem concurso: " + qtdMulheresMaisde30AnosSemConcurso +
                "\ne) a quantidade de concursados(as): " + contConcursados$as +
                "\nf) a média das alturas dos homens com menos de 40 anos: " + alturaMediaHomensComMenosDe40Anos);
        in.close();
    }
}