package Model;

public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private int idd;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, int idd) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idd = idd;
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public int getIdd() {
        return this.idd;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", email='" + this.email + '\'' +
                ", idd=" + this.idd +
                '}';
    }
}