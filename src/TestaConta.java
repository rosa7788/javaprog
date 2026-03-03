public class TestaConta {
    public static void main(String[] args) {
        System.out.println("=== Teste da Conta Bancária ===\n");

        // 1. Instancie um objeto c1 para o cliente "João Silva"
        Conta c1 = new Conta(123, 456, "João Silva");

        // 2. Tente realizar um depósito de R$ 500,00
        System.out.println("--- Depósito em c1 ---");
        c1.depositar(500);

        // 3. Tente realizar um saque de R$ 200,00 e imprima o estado da conta
        System.out.println("\n--- Saque em c1 ---");
        c1.sacar(200);
        System.out.println(c1);

        // 4. Instancie um objeto c2 para a cliente "Maria Souza"
        Conta c2 = new Conta(789, 456, "Maria Souza");

        // 5. Tente sacar R$ 50,00 (sem ter saldo) e verifique a mensagem de erro
        System.out.println("\n--- Saque em c2 (sem saldo) ---");
        c2.sacar(50);

        // 6. Tente encerrar a conta c1 enquanto ela ainda tem saldo
        System.out.println("\n--- Tentativa de encerrar c1 com saldo ---");
        c1.encerrarConta();

        // 7. Saque o restante do dinheiro de c1, encerre a conta e imprima os dados finais
        System.out.println("\n--- Sacando restante e encerrando c1 ---");
        c1.sacar(300); // Saldo restante após saque de 200: 300
        c1.encerrarConta();
        System.out.println(c1);
    }
}