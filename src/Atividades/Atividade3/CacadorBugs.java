package Atividades.Atividade3;

public class CacadorBugs {
    public static void main(String[] args) {

        int valor = 10;
        int contador = 5;

        exibirMensagens("Bem-vindo ao sistema", 1);

        // While deve ser uma expressão booleana
        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);

            // Decrementa o contador para o laço terminar
            contador--;
        }

    }

    //String
    public static void exibirMensagens(String texto, int repeticoes) {

        // For usa =
        for (int i = 0; i < repeticoes; i++) {

            //println imprime a mensagem numa nova linha
            System.out.println(texto);
        }
    }
}
