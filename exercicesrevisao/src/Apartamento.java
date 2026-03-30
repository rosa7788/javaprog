public class Apartamento {
    private int numero;
    private int andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public void mostrarInfo() {
        System.out.println("Apartamento " + numero + " - Andar: " + andar);
    }
}