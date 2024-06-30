import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  
        String genero;
        float altura, peso, imc;
        System.out.println("Digite seu gênero, seu peso e sua altura");
        genero = in.nextLine();
        peso = in.nextFloat();
        altura = in.nextFloat();
        imc = peso / (altura*altura);
      
        boolean baixoPeso, pesoNormal, sobrepeso, obesidadeLeve, obesidadeModerada, obesidadeGrave;
        baixoPeso = imc < 18;
        pesoNormal =  (genero.equals("F") && imc >= 18 && imc <= 24) || (genero.equals("M") && imc >= 18 && imc <= 25);
        sobrepeso = (genero.equals("F") && imc > 24 && imc <= 30) || (genero.equals("M") && imc > 25 && imc <= 30);
        obesidadeLeve = imc > 30 && imc <= 35;
        obesidadeModerada = imc > 35 && imc <= 40;
        obesidadeGrave = imc > 40;

        System.out.println("IMC: " + imc);
        if (obesidadeGrave) {
            System.out.println("Obesidade Grave");
        } else if (obesidadeModerada){
            System.out.println("Obesidade Moderada");
        } else if (obesidadeLeve){
            System.out.println("Obesidade leve");
        } else if (sobrepeso){
            System.out.println("Sobrepeso");
        } else if (pesoNormal){
            System.out.println("Peso Normal");
        } else if (baixoPeso){
            System.out.println("Baixo Peso");
        }

        in.close();

    }
}
