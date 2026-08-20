public class DoWhile {
    public static void main(String[] args) {

        // Senha de inicialização
        int senha = 0;

        do {
            // Mostra a tentativa atual
            System.out.println("Tentativa: " + senha);

            // Incrementa mais 1 a cada tentativa
            senha++;

        } while (senha != 5);

        // Execução quando a condição se torna falsa
        System.out.println("Tentativa: 5. SENHA CORRETA!");
    }
}
