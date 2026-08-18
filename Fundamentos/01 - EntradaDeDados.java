// Importação necessária para usar a classe Scanner
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler o teclado (System.in)
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        // nextLine() lê a linha inteira (incluindo espaços)
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        // nextInt() lê um número inteiro
        int idade = teclado.nextInt();

        System.out.print("Digite seu peso (ex: 75,5): ");
        // nextDouble() lê um número decimal (usa a vírgula ou ponto dependendo do idioma do PC)
        double peso = teclado.nextDouble();

        // --- EXIBINDO OS DADOS CAPTURADOS ---
        System.out.println("\n=== Cadastro Realizado ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");

        // Importante: Fechar o scanner para liberar a memória
        teclado.close();
    }
}