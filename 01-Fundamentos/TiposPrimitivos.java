public class TiposPrimitivos {
    public static void main(String[] args) {
        // --- 1. TIPOS INTEIROS ---
        byte idade = 25; // Até 127 (ocupa menos memória)
        int populacao = 850000; // Tipo padrão para números inteiros
        long idUsuario = 9584738291L; // Números gigantes (exige o 'L' no final)

        // --- 2. TIPOS PONTOS FLUTUANTES (DECIMAIS) ---
        float preco = 49.99f; // Precisão simples (exige o 'f' no final)
        double salario = 5500.50; // Precisão dupla (tipo padrão para decimais)

        // --- 3. TIPO CARACTER ---
        char genero = 'M'; // Guarda apenas uma letra/símbolo (aspas simples)

        // --- 4. TIPO BOOLEANO ---
        boolean estaAtivo = true; // Apenas true (verdadeiro) ou false (falso)

        // --- 5. TIPO TEXTO (Não é primitivo, é uma Classe) ---
        String nome = "Alex Silva"; // Guarda textos complexos (aspas duplas)

        // --- EXIBINDO OS VALORES NO CONSOLE ----
        System.out.println("=== Dados do Usuário ===");
        System.out.println("Nome: " + nome);      
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Gênero: " + genero);
        System.out.println("Id do usuário: " + idUsuario);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cadastro ativo: " + estaAtivo);
    }
}
