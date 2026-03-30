
public class Pleno extends Desenvolvedor {
    private int projetosEntr;

    public  Pleno(){
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntr){
        super(nome, linguagem, salarioBase);
        this.projetosEntr = projetosEntr;
    }

    public int getProjetosEntr() {
        return this.projetosEntr;
    }

    public void setProjetosEntr(int projetosEntr) {
        this.projetosEntr = projetosEntr;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetosEntr=" + projetosEntr +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Pleno desenvolvendo código e fazendo Coding Review");
    }

    @Override
    public float calcularBonus() {
        return  super.calcularBonus() + this.salarioBase * 0.15f;
    }


}