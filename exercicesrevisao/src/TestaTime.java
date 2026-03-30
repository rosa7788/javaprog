public class TestaTime {
    public static void main(String[] args) {

        // Criando atletas
        Atleta a1 = new Atleta(1, "João", "Armador");
        Atleta a2 = new Atleta(2, "Carlos", "Ala");
        Atleta a3 = new Atleta(3, "Pedro", "Pivô");

        // Criando time
        Time timeFranca = new Time(1, "Franca Basquete", "José Neto");

        // Contratando atletas
        timeFranca.contratarAtleta(a1);
        timeFranca.contratarAtleta(a2);

        // Mostrar atletas do time
        timeFranca.mostrarAtletas();

        // Demonstração da agregação:
        // Se o time for anulado, os atletas continuam existindo
        timeFranca = null;

        System.out.println("\nApós anular o time:");

        // Atletas ainda existem
        System.out.println("Verificando se os atletas ainda existem:");
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();  // Mesmo não contratado, ele existe

    }
}