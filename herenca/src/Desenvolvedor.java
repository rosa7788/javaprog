
    public class Desenvolvedor {
        protected String nome, linguagem;
        protected float salarioBase;

        public Desenvolvedor() {
        }

        public Desenvolvedor(String nome, String linguagem, float salarioBase) {
            this.nome = nome;
            this.linguagem = linguagem;
            this.salarioBase = salarioBase;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getLinguagem() {
            return this.linguagem;
        }

        public void setLinguagem(String linguagem) {
            this.linguagem = linguagem;
        }

        public float getSalarioBase() {
            return this.salarioBase;
        }

        public void setSalarioBase(float salarioBase) {
            this.salarioBase = salarioBase;
        }

        @Override
        public String toString() {
            return "Desenvolvedor{" +
                    "nome='" + this.nome + '\'' +
                    ", linguagem='" + this.linguagem + '\'' +
                    ", salarioBase=" + this.salarioBase +
                    '}';
        }

        public void codar(){
            System.out.println("Desenvolvedor planeja e escreve código-fonte");
        }

        public float calcularBonus(){
            return this.salarioBase * 0.05f;
        }

    }

