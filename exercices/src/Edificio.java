class Apartamento {
    int numero;
    int andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }
}

class Edificio {
    String nome;
    String endereco;
    ArrayList<Apartamento> apartamentos = new ArrayList<>();

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void construirApartamento(int num, int andar) {
        apartamentos.add(new Apartamento(num, andar));
    }
}