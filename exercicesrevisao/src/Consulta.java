import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    // Getters
    public LocalDateTime getData() {
        return data;
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", valorDaConsulta=" + valorDaConsulta +
                ", medico=" + medico.getNome() +
                ", paciente=" + paciente.getNome() +
                '}';
    }
}