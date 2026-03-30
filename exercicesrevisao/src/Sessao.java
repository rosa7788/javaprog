import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; // Agregação
    private ArrayList<Ingresso> ingressos; // Composição

    // Construtor
    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>(); // Composição: criados dentro da sessão
    }

    // Método de agregação: vincular filme existente
    public void vincularFilme(Filme f) {
        this.filme = f;
        System.out.println("Filme \"" + f.getTitulo() + "\" vinculado à Sessão.");
    }

    // Método de composição: vender ingresso (criado dentro da sessão)
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
        System.out.println("Ingresso vendido: " + assento + " - " + tipo);
    }

    // Mostrar dados completos da sessão
    public void mostrarSessao() {
        System.out.println("\n=== Dados da Sessão ===");
        System.out.println("Sessão ID: " + id + ", Sala: " + sala);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Horário: " + horario.format(formatter));
        if (filme != null) {
            System.out.println("Filme: " + filme.toString());
        } else {
            System.out.println("Nenhum filme vinculado.");
        }
        System.out.println("Ingressos vendidos:");
        for (Ingresso ing : ingressos) {
            System.out.println(ing.toString());
        }
    }
}
