import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TestaClinica {

    public static void main(String[] args) {
        // Criar médico
        Medico medico = new Medico(1, "Dr. João Silva", "Cardiologia");

        // Criar paciente
        Paciente paciente = new Paciente(1, "Maria Oliveira", "123.456.789-00");

        // Criar lista de consultas
        List<Consulta> consultas = new ArrayList<>();

        // Registrar consulta para o dia 20/05/2026 às 14:30
        LocalDateTime dataConsulta = LocalDateTime.of(2026, Month.MAY, 20, 14, 30);
        Consulta consulta = new Consulta(dataConsulta, 200.0, medico, paciente);

        consultas.add(consulta);

        // Exibir todas as consultas
        System.out.println("Consultas Registradas:");
        for (Consulta c : consultas) {
            System.out.println(c);
        }
    }
}