public class Conta {

    // 1. Atributos (Visibilidade Pública)
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status; // true = ativa | false = encerrada

    // 2. Método Construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0f;
        this.status = true; // conta inicia ativa
    }

    // 3. Métodos de Comportamento

    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Conta inativa. Não é possível depositar.");
        }
    }

    public void sacar(float valor) {
        if (!status) {
            System.out.println("Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("A conta ainda possui saldo. Saque o valor antes de encerrar.");
        }
    }

    @Override
    public String toString() {
        return "Conta {" +
                "Número: " + numeroConta +
                ", Agência: " + agencia +
                ", Cliente: " + nomeCliente +
                ", Saldo: R$ " + saldo +
                ", Status: " + (status ? "Ativa" : "Encerrada") +
                "}";
    }

