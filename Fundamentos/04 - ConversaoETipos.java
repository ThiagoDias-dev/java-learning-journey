public class ConversaoETipos {
    public static void main(String[] args) {
        // --- 1. CASTING (CONVERSÃO DE TIPOS PRIMITIVOS) ---
        
        // Casting Implicito (int -> double)
        int numeroInt = 100;
        double numeroDouble = numeroInt; 
        System.out.println("Casting Implicito (int para double): " + numeroDouble); // 100.0

        // Casting Explicito (double -> int)
        double precoDouble = 99.99;
        int precoInt = (int) precoDouble; // Trunca os decimais
        System.out.println("Casting Explicito (double para int): " + precoInt); // 99


        // --- 2. WRAPPER CLASSES E AUTOBOXING / UNBOXING ---
        
        // Autoboxing (primitivo int -> Wrapper Integer)
        Integer idadeWrapper = 25; 
        
        // Unboxing (Wrapper Integer -> primitivo int)
        int idadePrimitiva = idadeWrapper; 


        // --- 3. PARSING (CONVERTENDO STRING PARA NÚMEROS) ---
        
        String textoNumero = "150";
        String textoDecimal = "49.90";

        // Convertendo String em tipos numéricos
        int valorConvertido = Integer.parseInt(textoNumero);
        double precoConvertido = Double.parseDouble(textoDecimal);

        System.out.println("Soma com valor convertido: " + (valorConvertido + 50)); // 200
        System.out.println("Preco convertido: R$ " + precoConvertido);
    }
}