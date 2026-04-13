import java.util.Random;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (!ligado) {
            System.out.println("Termostato desligado. Não é possível ler temperatura.");
            return 0.0;
        }

        // Simula leitura de temperatura
        Random random = new Random();
        double temperatura = 18 + (30 - 18) * random.nextDouble();

        return temperatura;
    }
}