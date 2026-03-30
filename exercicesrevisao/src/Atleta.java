public class Atleta {
    private int id;
    private String nome;
    private String posicao;

    // Construtor
    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    // Método para exibir informações
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Posição: " + posicao);
    }
}