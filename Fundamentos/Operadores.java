public class OperadoresExemplo {
    public static void main(String[] args) {
        // --- 1. OPERADORES ARITMÉTICOS ---
        int a = 10;
        int b = 3;
        
        int soma = a + b;       // = 13
        int subtracao = a - b;  // = 7
        int multiplicacao = a * b; // = 30
        double divisao = (double) a / b; // 3.3333... (uso de cast para não perder os decimais)
        int resto = a % b;      // 1 (resto da divisão de 10 por 3)

        // --- 2. OPERADORES DE COMPARAÇÃO (RELACIONAIS) ---
        boolean ehMaior = a > b;     // true (Leia como se fosse uma afirmação)
        boolean ehIgual = a == b;    // false (Leia como se fosse uma afirmação)
        boolean ehDiferente = a != b; // true (Leia como se fosse uma afirmação)

        // --- 3. OPERADORES LÓGICOS ---
        boolean temIdade = true;
        boolean temCarteira = false;
        
        // E (&&) - Ambos precisam ser verdadeiros
        boolean podeDirigir = temIdade && temCarteira; // false
        
        // OU (||) - Pelo menos um precisa ser verdadeiro
        boolean podeViajar = temIdade || temCarteira; // true
        
        // Negação (!) - Inverte o valor booleano
        boolean naoTemIdade = !temIdade; // false

        // --- EXIBINDO OS RESULTADOS ---
        System.out.println("=== Operações com " + a + " e " + b + " ===");
        System.out.println("Divisão exata: " + divisao);
        System.out.println("Resto da divisão: " + resto);
        System.out.println("A é maior que B? " + ehMaior);
        System.out.println("Pode dirigir? " + podeDirigir);
    }
}