package dc.unifacef.memoria.Model;

public class Produto {
    private Long id;
    private String nome;
    private Double preco;
    private Integer qtde;

    public Produto() {
    }

    public Produto(Long id, String nome, Double preco, Integer qtde) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public Integer getQtde() {
        return this.qtde;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", preco=" + this.preco +
                ", qtde=" + this.qtde +
                '}';
    }
}