public class Processador {
    private String marca;
    private String modelo;
    private double frequencia; // em GHz

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public void mostrarInfo() {
        System.out.println("Processador: " + marca + " " + modelo + " - " + frequencia + "GHz");
    }
}
