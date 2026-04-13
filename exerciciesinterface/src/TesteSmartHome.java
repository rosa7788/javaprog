public class TesteSmartHome{
    public static void main(String[] args) {

        // Testando Fechadura
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");

        fechadura.validarAcesso("1111");
        fechadura.ligar(); // não deve abrir

        fechadura.validarAcesso("1234");
        fechadura.ligar(); // deve abrir
        fechadura.desligar();

        System.out.println("---------------------");

        // Testando Termostato
        TermostatoSmart termostato = new TermostatoSmart();

        termostato.ligar();
        double temp = termostato.lerTemperatura();
        System.out.println("Temperatura atual: " + temp + "°C");

        termostato.desligar();
    }
}