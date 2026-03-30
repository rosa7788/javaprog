public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int duracao; // em minutos

    // Construtor completo
    public Filme(int id, String titulo, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // toString para exibir informações do filme
    @Override
    public String toString() {
        return "Filme [ID: " + id + ", Título: " + titulo + ", Gênero: " + genero + ", Duração: " + duracao + " min]";
    }
}