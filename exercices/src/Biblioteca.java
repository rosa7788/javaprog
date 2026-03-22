import java.time.LocalDate;

class Leitor {
    int id;
    String nome;

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}

class Livro {
    int id;
    String titulo;
    String autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
}

class Emprestimo {
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;
    Leitor leitor;
    Livro livro;

    public Emprestimo(LocalDate de, LocalDate dd, Leitor l, Livro li) {
        this.dataEmprestimo = de;
        this.dataDevolucao = dd;
        this.leitor = l;
        this.livro = li;
    }

    public String toString() {
        return "Leitor: " + leitor.nome +
                "\nLivro: " + livro.titulo +
                "\nEmprestado em: " + dataEmprestimo +
                "\nDevolver até: " + dataDevolucao;
    }
}