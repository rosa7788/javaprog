import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    // Construtor
    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    // Método para construir apartamento
    public void construirApartamento(int numero, int andar) {
        Apartamento apt = new Apartamento(numero, andar); // Criado dentro do edifício → composição
        apartamentos.add(apt);
        System.out.println("Apartamento " + numero + " construído no " + andar + "º andar.");
    }

    // Listar todos os apartamentos
    public void listarApartamentos() {
        System.out.println("Apartamentos do Edifício " + nome + ":");
        for (Apartamento apt : apartamentos) {
            apt.mostrarInfo();
        }
    }
}