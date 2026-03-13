public class ItemPedido {
    private int id;
    private float qtde;
    private Produto produto;


    public ItemPedido(int id, float qtde, Produto produto) {
        this.id = id;
        this.qtde = qtde;
        this.produto = produto;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtde() {
        return this.qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", produto=" + produto +
                '}';
    }
}