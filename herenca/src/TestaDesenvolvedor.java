
import java.util.ArrayList;
import java.util.Arrays;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){ // no polimorfismo o tipo deve ser sempre a super classe e os args devem ser sempre as subclasses
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }
    public static void main(String[] args) {
        Junior j1 = new Junior("fulano", "Java", 4000, "Beltrano");
        exibir(j1);

        Pleno p1 = new Pleno("Beltrano", "Java", 6000, 5);
        exibir(p1);


        Senior s1 = new Senior("Ciclano", "Java", 8000, 2000);
        exibir(s1);

        ArrayList<Desenvolvedor> empresa = new ArrayList<Desenvolvedor>();
        empresa.add(j1);
        empresa.add(p1);
        empresa.add(s1);


    }
}