public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        // Vetor do tipo da SUPERCLASSE
        Desenvolvedor[] vetor = new Desenvolvedor[4];

        // Preenchendo com objetos de subclasses diferentes
        vetor[0] = new Junior("Fulano", "Java", 4000, "Beltrano");
        vetor[1] = new Pleno("Beltrano", "Java", 6000, 5);
        vetor[2] = new Senior("Ciclano", "Java", 8000, 2000);
        vetor[3] = new Desenvolvedor("Genérico", "Python", 5000);

        // Percorrendo o vetor — polimorfismo em ação!
        for (Desenvolvedor dev : vetor) {
            dev.codar();
            System.out.println("Bônus: " + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println("---");
        }
    }
}