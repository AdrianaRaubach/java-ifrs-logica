import java.util.Scanner;

public class SegundoPrograma {
    public static void main (String [] args){
        Scanner in;
        in = new Scanner(System.in);
        String apelido;
        System.out.println("Digite seu apelido");
        apelido = in.next();
        System.out.println("O apelido é " + apelido);
    }
}