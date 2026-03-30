public class TestaVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Aviao("Boeing", "737", 850.0f, 10000.0f);
        v.mover(); // → "Avião voando a 850.0 km/h e 10000.0 metros"

        v = new CarroEletrico("Tesla", "Model 3", 180.0f, 500);
        v.mover(); // → "Carro elétrico movendo-se silenciosamente"
    }
}