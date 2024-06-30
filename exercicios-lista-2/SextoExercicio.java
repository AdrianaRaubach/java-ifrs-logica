import java.util.Scanner;
public class SextoExercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
        e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
        dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
        a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
        o usuário informe sua data de nascimento e o sistema irá calcular quantos
        anos, meses e dias a pessoa viveu. */
        System.out.println("Digite sua data de nascimento e a data atual no formato dd mm aa");
        int dataNascimentodd, dataNascimentomm, dataNascimentoaa, dataAtualdd, dataAtualmm, dataAtualaa, idadeDias;
        dataNascimentodd = in.nextInt();
        dataNascimentomm = in.nextInt();
        dataNascimentoaa = in.nextInt();
        dataAtualdd = in.nextInt();
        dataAtualmm = in.nextInt();
        dataAtualaa = in.nextInt();

        idadeDias = dataAtualdd - dataNascimentodd + ((dataAtualmm - dataNascimentomm) *30) + ((dataAtualaa - dataNascimentoaa) *365);

        System.out.println("Idade em dias: " + idadeDias);

        in.close();
    }
}
