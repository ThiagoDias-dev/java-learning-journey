import java.util.Scanner;

public class EstruturaSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Menu de Opções ===");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.print("Escolha uma opção (1-3): ");
        int opcao = teclado.nextInt();

        // Usando o Switch Expression (Java 14+) - Mais limpo e sem risco de esquecer o 'break'
        String mensagem = switch (opcao) {
            case 1 -> "Carregando seu saldo atual...";
            case 2 -> "Por favor, insira o valor do depósito.";
            case 3 -> "Aguarde a saída das cédulas.";
            default -> "Opção inválida! Tente novamente.";
        };

        System.out.println("\nResultado: " + mensagem);

        // --- EXEMPLO COM TEXTO (String) ---
        System.out.print("\nDigite o dia da semana (ex: SEG, TER, DOM): ");
        String dia = teclado.next().toUpperCase(); // Garante que fique em maiúsculo

        switch (dia) {
            case "SAB", "DOM" -> System.out.println("Final de semana! Hora de descansar.");
            case "SEG", "TER", "QUA", "QUI", "SEX" -> System.out.println("Dia útil. Hora de estudar Java!");
            default -> System.out.println("Dia desconhecido.");
        }

        teclado.close();
    }
}
