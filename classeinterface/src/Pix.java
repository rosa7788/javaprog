public class Pix implements Pagamento{
    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando um QR code para chave pix");
        System.out.println("Pagamento do valor "+ valor+ " foi enviado instantaneamente");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no App do banco");
    }
}