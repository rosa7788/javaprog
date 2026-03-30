public class TesteEdificio {
    public static void main(String[] args) {

        // Criando um edifício
        Edificio edif = new Edificio("Residencial Sol", "Rua das Flores, 123");

        // Construindo apartamentos
        edif.construirApartamento(101, 1);
        edif.construirApartamento(102, 1);
        edif.construirApartamento(201, 2);

        // Listando apartamentos
        edif.listarApartamentos();

        // Deletando o edifício
        edif = null;

        System.out.println("\nApós deletar o edifício, todos os apartamentos também deixam de existir, pois são composição.");
    }
}