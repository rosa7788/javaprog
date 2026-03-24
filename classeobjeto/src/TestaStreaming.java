public class TestaStreaming {
    public static void main(String[] args) {
        System.out.println("=== Teste do Sistema de Streaming ===\n");

        // Criando perfis
        Streaming perfil1 = new Streaming("João", "Premium");
        Streaming perfil2 = new Streaming("Maria", "Básico");

        // Testando assistir filmes
        System.out.println("--- Assistindo filmes ---");
        perfil1.assistirFilme("O Poderoso Chefão");
        perfil2.assistirFilme("Vingadores");

        System.out.println("\n--- Dados dos perfis ---");
        System.out.println(perfil1);
        System.out.println(perfil2);

        // Testando cancelamento
        System.out.println("\n--- Cancelando assinatura de Maria ---");
        perfil2.cancelarAssinatura();

        // Tentando assistir com conta inativa
        System.out.println("\n--- Tentando assistir com conta inativa ---");
        perfil2.assistirFilme("Interestelar");

        System.out.println("\n--- Dados atualizados ---");
        System.out.println(perfil2);
    }
}