import java.time.LocalDateTime;

class Medico {
    int id;
    String nome;
    String especialidade;

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }
}

class Paciente {
    int id;
    String nome;
    String cpf;

    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
}

class Consulta {
    LocalDateTime data;
    double valor;
    Medico medico;
    Paciente paciente;

    public Consulta(LocalDateTime data, double valor, Medico medico, Paciente paciente) {
        this.data = data;
        this.valor = valor;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String toString() {
        return "Consulta em " + data +
                "\nMédico: " + medico.nome +
                "\nPaciente: " + paciente.nome +
                "\nValor: R$" + valor;
    }
}