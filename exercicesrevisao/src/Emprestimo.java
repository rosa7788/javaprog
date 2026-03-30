import java.time.LocalDate;

public class Emprestimo {
    private Leitor leitor;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Leitor leitor, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista) {
        this.leitor = leitor;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    @Override
    public String toString() {
        return "Empréstimo{" +
                "leitor=" + leitor.getNome() +
                ", livro='" + livro.getTitulo() + "'" +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista +
                '}';
    }
}
