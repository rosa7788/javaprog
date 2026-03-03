public class Placar {
    // Atributos
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    // Construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Métodos
    public void registrarPonto(String time, int tipo) {
        if (periodoQuarto > 4) {
            System.out.println("Jogo já terminou! Não é possível registrar pontos.");
            return;
        }

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de ponto inválido! Use 1, 2 ou 3.");
            return;
        }

        if (time.equals("casa")) {
            pontosCasa += tipo;
            System.out.println(nomeTimeCasa + " marcou " + tipo + " ponto(s)!");
        } else if (time.equals("visitante")) {
            pontosVisitante += tipo;
            System.out.println(nomeTimeVisitante + " marcou " + tipo + " ponto(s)!");
        } else {
            System.out.println("Time inválido! Use 'casa' ou 'visitante'.");
        }
    }

    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
            System.out.println("Iniciando o " + periodoQuarto + "º quarto.");
        } else if (periodoQuarto == 4) {
            System.out.println("O jogo terminou!");
            periodoQuarto++; // Para marcar que o jogo acabou (agora >4)
        } else {
            System.out.println("O jogo já terminou!");
        }
    }

    public String toString() {
        String periodo;
        if (periodoQuarto > 4) {
            periodo = "Fim de jogo";
        } else {
            periodo = periodoQuarto + "º quarto";
        }

        return nomeTimeCasa + " " + pontosCasa + " x " + pontosVisitante + " " +
                nomeTimeVisitante + " - Período: " + periodo;
    }
}