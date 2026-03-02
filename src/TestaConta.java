public class TestaConta {

    public static void main(String[] args) {

        // 1. Instanciar objeto c1
        Conta c1 = new Conta(1234, 101, "Samara Lima");

        // 2. Depositar R$ 500
        c1.depositar(500.0f);

        // 3. Sacar R$ 200 e imprimir estado
        c1.sacar(200.0f);
        System.out.println(c1);

        // 4. Instanciar objeto c2
        Conta c2 = new Conta(5678, 202, "Maria Carvalho");

        // 5. Tentar sacar R$ 50 (sem saldo)
        c2.sacar(50.0f);

        // 6. Tentar encerrar conta c1 com saldo
        c1.encerrarConta();

        // 7. Sacar restante, encerrar e imprimir dados finais
        c1.sacar(300.0f);
        c1.encerrarConta();
        System.out.println(c1);
    }
}