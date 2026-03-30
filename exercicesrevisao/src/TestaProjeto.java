public class TestaProjeto {
    public static void main(String[] args) {

        // Criando programadores
        Programador prog1 = new Programador(1, "Alice", "Java");
        Programador prog2 = new Programador(2, "Bob", "Python");
        Programador prog3 = new Programador(3, "Carlos", "JavaScript");

        // Criando projeto
        Projeto projeto1 = new Projeto(101, "Sistema de Vendas");

        // Adicionando programadores ao projeto
        projeto1.adicionarProgramador(prog1);
        projeto1.adicionarProgramador(prog2);

        // Listar programadores do projeto
        projeto1.listarProgramadores();

        // Demonstrando que os programadores existem independentemente do projeto
        projeto1 = null; // Projeto é anulado

        System.out.println("\nApós anular o projeto:");
        System.out.println("Programadores ainda existem:");
        prog1.mostrarInfo();
        prog2.mostrarInfo();
        prog3.mostrarInfo(); // Mesmo sem ter sido adicionado, existe
    }
}