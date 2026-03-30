import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente; // Agregação: Venda "tem" um cliente
    private ArrayList<ItemVenda> itens; // Composição: Venda “tem” itens de venda

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Adicionar item de venda
    public void adicionarItem(int itemId, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(itemId, quantidade, produto);
        itens.add(item);
        System.out.println("Item adicionado: " + produto.getNome() + " x" + quantidade);
    }

    // Calcular total da venda
    public double calcularTotalVenda() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    // Mostrar detalhes da venda
    public void mostrarVenda() {
        System.out.println("Venda ID: " + id);
        cliente.mostrarInfo();
        System.out.println("Itens da venda:");
        for (ItemVenda item : itens) {
            item.mostrarInfo();
        }
        System.out.println("Total da venda: R$" + calcularTotalVenda());
    }
}