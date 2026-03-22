class Programador {
    int id;
    String nome;
    String linguagem;

    public Programador(int id, String nome, String linguagem) {
        this.id = id;
        this.nome = nome;
        this.linguagem = linguagem;
    }
}

class Projeto {
    int id;
    String nomeProjeto;
    ArrayList<Programador> programadores = new ArrayList<>();

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
    }

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        for (Programador p : programadores) {
            System.out.println(p.nome + " - " + p.linguagem);
        }
    }
}