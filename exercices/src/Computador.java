class Processador {
    String marca;
    String modelo;
    double frequencia;

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }
}

class Computador {
    int id;
    String marca;
    Processador processador;

    public Computador(int id, String marca, String m, String mod, double freq) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(m, mod, freq);
    }
}