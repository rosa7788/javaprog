import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {

        // Criar filmes
        Filme filme1 = new Filme(1, "Batman", "Ação", 130);
        Filme filme2 = new Filme(2, "Duna", "Ficção", 155);

        // Criar sessão para Sala 01 em uma data futura
        LocalDateTime dataSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao1 = new Sessao(101, dataSessao, 1);

        // Agregação: vincular filme "Batman"
        sessao1.vincularFilme(filme1);

        // Composição: vender 3 ingressos
        sessao1.venderIngresso(1, "A1", "Inteira", 20.0f);
        sessao1.venderIngresso(2, "A2", "Meia", 10.0f);
        sessao1.venderIngresso(3, "A3", "Inteira", 20.0f);

        // Mostrar dados completos da sessão
        sessao1.mostrarSessao();

        // Demonstrando independência do filme
        sessao1 = null; // Sessão cancelada
        System.out.println("\nSessão cancelada, ingressos desaparecem, mas filmes ainda existem:");
        System.out.println(filme1.toString());
        System.out.println(filme2.toString());
    }
}