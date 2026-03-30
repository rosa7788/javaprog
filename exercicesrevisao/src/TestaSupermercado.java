public class TestaSupermercado {
    public static void main(String[] args) {

        // Criando produtos (estoque)
        Produto p1 = new Produto(1, "Arroz", 20.0);
        Produto p2 = new Produto(2, "Feijão", 8.5);
        Produto p3 = new Produto(3, "Macarrão", 5.0);

        // Criando cliente
        Cliente cliente1 = new Cliente(101, "Maria");

        // Criando venda
        Venda venda1 = new Venda(1001, cliente1);

        // Adicionando itens à venda
        venda1.adicionarItem(1, 2, p1); // 2 pacotes de arroz
        venda1.adicionarItem(2, 3, p2); // 3 pacotes de feijão
        venda1.adicionarItem(3, 1, p3); // 1 pacote de macarrão

        // Mostrar detalhes da venda
        System.out.println("\n=== Detalhes da Venda ===");
        venda1.mostrarVenda();

        // Demonstrando que clientes e produtos ainda existem
        venda1 = null; // A venda é destruída

        System.out.println("\nApós deletar a venda:");
        System.out.println("Cliente ainda existe:");
        cliente1.mostrarInfo();

        System.out.println("Produtos ainda existem no estoque:");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}