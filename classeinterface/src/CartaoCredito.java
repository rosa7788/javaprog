public class CartaoCredito implements Pagamento{

    @Override
    public void autorizar(double valor) {
        System.out.println("verificando limite do cartão");
        System.out.println("Pagamento no valor" + valor + "foi autorizado");

    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante foi enviado para o seu email");
    }
}