import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor leitor1 = new Leitor(1, "João Silva");
        Livro livro1 = new Livro(101, "Java Básico", "Maria Souza");

        Emprestimo emprestimo1 = new Emprestimo(
                leitor1,
                livro1,
                LocalDate.of(2026, 3, 23),
                LocalDate.of(2026, 4, 2)
        );

        System.out.println(emprestimo1);
    }
}