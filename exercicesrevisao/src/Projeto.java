import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private int id;
    private String nome;
    private List<Programador> programadores; // Agregação: lista de programadores

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.programadores = new ArrayList<>();
    }

    public void adicionarProgramador(Programador programador) {
        programadores.add(programador);
        System.out.println("Programador " + programador.getNome() + " adicionado ao projeto " + nome);
    }

    public void listarProgramadores() {
        System.out.println("\nProgramadores do projeto: " + nome);
        if (programadores.isEmpty()) {
            System.out.println("Nenhum programador cadastrado.");
        } else {
            for (Programador p : programadores) {
                p.mostrarInfo();
            }
        }
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
}
