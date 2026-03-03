public class TestaPlacar {
    public static void main(String[] args) {
        System.out.println("=== Simulador de Placar de Basquete ===\n");

        // Criando o placar
        Placar jogo = new Placar("Los Angeles Lakers", "Boston Celtics");

        System.out.println("Placar inicial:");
        System.out.println(jogo);

        // 1º Quarto
        System.out.println("\n--- 1º Quarto ---");
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("casa", 3);
        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("visitante", 1);
        System.out.println(jogo);

        // 2º Quarto
        System.out.println("\n--- 2º Quarto ---");
        jogo.proximoQuarto();
        jogo.registrarPonto("casa", 3);
        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("visitante", 2);
        System.out.println(jogo);

        // 3º Quarto
        System.out.println("\n--- 3º Quarto ---");
        jogo.proximoQuarto();
        jogo.registrarPonto("casa", 1);
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        System.out.println(jogo);

        // 4º Quarto
        System.out.println("\n--- 4º Quarto ---");
        jogo.proximoQuarto();
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("visitante", 2);
        System.out.println(jogo);

        // Fim do jogo
        System.out.println("\n--- Fim do Jogo ---");
        jogo.proximoQuarto();

        // Tentar registrar ponto após o fim
        System.out.println("\n--- Tentativa de registrar após o fim ---");
        jogo.registrarPonto("casa", 2);

        System.out.println("\nPlacar final:");
        System.out.println(jogo);
    }
}