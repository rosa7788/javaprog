
public class Senior extends Desenvolvedor {
    private int verbaLider;

    public Senior(){
        super();
    }

    public Senior(String nome, String linguagem, int salarioBase, int verbaLider){
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public int getVerbaLider() {
        return this.verbaLider;
    }

    public void setVerbaLider(int verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Senior definindo a arquitetura do software e liderando pessoas");

    }

    @Override
    public float calcularBonus() {
        return super.calcularBonus() + this.salarioBase * 0.30f;
    }
}