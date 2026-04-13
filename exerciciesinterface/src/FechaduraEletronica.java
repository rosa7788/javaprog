public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {

    private String senhaCorreta;
    private boolean acessoLiberado = false;
    private boolean ligada = false;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {
            acessoLiberado = true;
            System.out.println("Acesso permitido!");
        } else {
            acessoLiberado = false;
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        if (acessoLiberado) {
            ligada = true;
            System.out.println("Fechadura destrancada.");
        } else {
            System.out.println("Acesso não autorizado. Não é possível destrancar.");
        }
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("Fechadura trancada.");
    }
}