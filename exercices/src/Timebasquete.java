import java.util.ArrayList;

class Atleta {
    int id;
    String nome;
    String posicao;

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }
}

class Time {
    int id;
    String nome;
    String tecnico;
    ArrayList<Atleta> atletas = new ArrayList<>();

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public void contratarAtleta(Atleta a) {
        atletas.add(a);
    }
}