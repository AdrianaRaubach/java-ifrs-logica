import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 8. Faça um algoritmo para ler um número que é um código de usuário. Caso este
         * código seja diferente de um código armazenado internamente no algoritmo
         * (igual a
         * 1234) deve ser apresentada a mensagem “Usuário inválido!”. Caso o Código seja
         * correto, deve ser lido outro valor que é a senha. Se esta senha estiver
         * incorreta (a
         * certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha
         * esteja correta, deve ser mostrada a mensagem “Acesso permitido”.
         */
        int codPadrao, codUsuario, senhaPadrao, senhaUsuario;
        codPadrao = 1234;
        senhaPadrao = 9999;
        String mensagemAcesso;
        System.out.println("Digite o usuário");
        codUsuario = in.nextInt();

        if (codPadrao == codUsuario) {
            System.out.println("Digite a senha");
            senhaUsuario = in.nextInt();
            if (senhaPadrao == senhaUsuario) {
                mensagemAcesso = "Acesso Permitido";
            } else {
                mensagemAcesso = "Senha Inválida";
            }
        } else {
            mensagemAcesso = "Usuário Inválido";
        }

        System.out.println(mensagemAcesso);

        in.close();
    }
}
