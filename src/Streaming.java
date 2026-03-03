    public class Streaming {
    // Atributos
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        // Define mensalidade baseada no plano
        if (plano.equals("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equals("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equals("Família")) {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0;
            System.out.println("Plano inválido!");
        }
    }

    // Métodos
    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Assinatura inativa. Por favor, pague a fatura.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
        System.out.println("Assinatura cancelada com sucesso.");
    }

    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";
        return "Usuário: " + usuario + " | Plano: " + plano +
                " | Mensalidade: R$ " + mensalidade + " | Status: " + status +
                " | Último filme: " + (ultimoFilmeAssistido.isEmpty() ? "Nenhum" : ultimoFilmeAssistido);
    }
}