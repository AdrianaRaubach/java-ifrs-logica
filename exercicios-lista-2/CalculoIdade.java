import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        // Criando um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando a data de nascimento
        System.out.println("Informe sua data de nascimento (formato dd/MM/yyyy):");
        String input = scanner.nextLine();

        // Convertendo a entrada do usuário para LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(input, formatter);

        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calculando a idade
        int idade = calcularIdade(dataNascimento, dataAtual);

        // Exibindo a idade
        System.out.println("Sua idade é: " + idade + " anos");

        // Fechando o scanner
        scanner.close();
    }

    // Função para calcular a idade
    private static int calcularIdade(LocalDate dataNascimento, LocalDate dataAtual) {
        return dataAtual.minusYears(dataNascimento.getYear())
                .minusMonths(dataNascimento.getMonthValue())
                .minusDays(dataNascimento.getDayOfMonth())
                .getYear();
    }
}
