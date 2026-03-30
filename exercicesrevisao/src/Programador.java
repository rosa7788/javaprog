public class Programador {
    private int id;
    private String nome;
    private String linguagemPrincipal;

    // Construtor
    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    // Método para exibir informações do programador
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Linguagem Principal: " + linguagemPrincipal);
    }
}