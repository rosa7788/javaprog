<<<<<<< HEAD
public class Carro{
    // variáveis ou propriedade ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo de dado primitivo
    public boolean motor; // boolean é um tipo de dado primitivo
    // método construtor - tem o nome da classe
    public Carro(String marca, String modelo, float velocidade, boolean motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    // Ligar carro
    public void ligarCarro() {
        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor ligado");
        }
    }
    // Acelerar carro de X
    public void acelerar(float x) {
        if (this.motor) {
            this.velocidade += x;
            System.out.println("Nova velocidade: " + this.velocidade);
        }
    }
    // Frear carro
    public void frear(float x) {
        if (this.motor && this.velocidade - x >= 0) {
            this.velocidade -= x;
            System.out.println("Nova velocidade: " + this.velocidade);
        }
    }
    // Desligar carro
    public void desligarCarro() {
        if (this.motor) {
            this.motor = false;
            System.out.println("Motor desligado");
        }
        else System.out.println("Não foi possível frear");
    }
    // método que converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return "Marca: " + this.marca +
                "Modelo: " + this.modelo +
                "Velocidade: " + this.velocidade +
                "Motor: " + this.motor;
    }
=======
public class Carro {
>>>>>>> 2e710bcd8e7b24b233a7d712946d1031d1520fb4
}
