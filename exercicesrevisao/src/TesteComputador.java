public class TesteComputador {
    public static void main(String[] args) {
        // Criando um computador
        Computador pc1 = new Computador(101, "Dell", "Intel", "i7-12700", 3.6);

        // Mostrando informações
        pc1.mostrarInfo();

        // Deletando o computador
        pc1 = null;

        System.out.println("\nApós deletar o computador, o processador também não existe mais, pois é composição.");
    }
}