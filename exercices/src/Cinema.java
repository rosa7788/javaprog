import java.time.LocalDateTime;

class Filme {
    int id;
    String titulo;
    String genero;
    int duracao;

    public Filme(int id, String titulo, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String toString() {
        return titulo + " (" + genero + ")";
    }
}

class Ingresso {
    int id;
    String assento;
    String tipo;
    float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String toString() {
        return assento + " - " + tipo + " - R$" + preco;
    }
}

class Sessao {
    int id;
    LocalDateTime horario;
    int sala;
    Filme filme;
    ArrayList<Ingresso> ingressos = new ArrayList<>();

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    public void imprimir() {
        System.out.println("Filme: " + filme);
        System.out.println("Horário: " + horario);
        System.out.println("Ingressos:");
        for (Ingresso i : ingressos) {
            System.out.println(i);
        }
    }
}