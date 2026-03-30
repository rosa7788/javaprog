public class Computador {
    private int id;
    private String marca;
    private Processador processador; // Composição: computador TEM um processador

    // Construtor
    public Computador(int id, String marca, String marcaProc, String modeloProc, double freqProc) {
        this.id = id;
        this.marca = marca;
        // O processador é criado dentro do computador → composição
        this.processador = new Processador(marcaProc, modeloProc, freqProc);
    }

    public void mostrarInfo() {
        System.out.println("Computador ID: " + id + ", Marca: " + marca);
        processador.mostrarInfo();
    }
}