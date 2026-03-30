import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    // Construtor
    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    // Método para contratar um atleta
    public void contratarAtleta(Atleta a) {
        atletas.add(a);
        System.out.println(a.getNome() + " foi contratado pelo time " + nome + "!");
    }

    // Mostrar todos os atletas do time
    public void mostrarAtletas() {
        System.out.println("Atletas do time " + nome + ":");
        for (Atleta a : atletas) {
            a.mostrarInfo();
        }
    }
}
