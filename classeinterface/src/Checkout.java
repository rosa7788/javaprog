public class Checkout {
    static void main(String[] args) {
        Pagamento camaleao;

        camaleao = new CartaoCredito();
        camaleao.autorizar(700); //polimorfismo
        camaleao.exibirComprovante(); //polimorfismo

        camaleao = new Pix();
        camaleao.autorizar(800); //polimorfismo
        camaleao.exibirComprovante(); //polimorfismo




    }
}