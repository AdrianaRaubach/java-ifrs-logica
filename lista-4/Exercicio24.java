import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome = "Nome", sexo = "V", atletaMaisAlto$M = "Vazio", atletaMaisPesadaF = "Vazio";
        int idade = 0, mediaIdadeAtletas = 0, cont=0;
        float peso = 0, altura = 0, alturaMaisAlto = 0, pesoMaisPesada = 0;

        while (!nome.equals("@")) {
            System.out.println("Digite o nome do atleta, gênero (M/F), idade, peso e altura respectivamente\nPara encerrar digite @");
            nome = in.nextLine();
            if (nome.equals("@")) {
                break;
            }
            sexo = in.nextLine();
            idade = in.nextInt();
            peso = in.nextFloat();
            altura = in.nextFloat();
            in.nextLine();

            mediaIdadeAtletas += idade;

            if (sexo.equals("M")) {
                if (atletaMaisAlto$M.equals("Vazio")) {
                    atletaMaisAlto$M = nome;
                    alturaMaisAlto = altura;
                }
                if (altura > alturaMaisAlto) {
                    atletaMaisAlto$M = nome;
                    alturaMaisAlto = altura;
                }
            }
            if (sexo.equals("F")) {
                if (atletaMaisPesadaF.equals("Vazio")) {
                    atletaMaisPesadaF = nome;
                    pesoMaisPesada = peso;
                }
                if (peso > pesoMaisPesada) {
                    atletaMaisPesadaF = nome;
                    pesoMaisPesada = peso;
                }
            }

            cont++;
        }

        mediaIdadeAtletas = mediaIdadeAtletas/cont;

        System.out.printf("Atleta Masculino mais alto: %s\nAtleta Feminina mais pesada: %s\nIdade média dos Atletas: %d", atletaMaisAlto$M, atletaMaisPesadaF, mediaIdadeAtletas);


        in.close();


    }
}
