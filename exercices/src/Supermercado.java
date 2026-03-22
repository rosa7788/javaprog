class Produto {
    int id;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}

class Cliente {
    int id;
    String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}

class ItemVenda {
    int id;
    int quantidade;
    Produto produto;

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }
}

class Venda {
    Cliente cliente;
    ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(int id, int qtd, Produto p) {
        itens.add(new ItemVenda(id, qtd, p));
    }
}