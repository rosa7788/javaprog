public class Teste {

    public static void main(String[] args) {

        // Alunos independentes
        Aluno a1 = new Aluno(1, "Carlos", "12345", "ADS");
        Aluno a2 = new Aluno(2, "Marina", "67890", "ADS");

        // Disciplina
        Disciplina d = new Disciplina(10, "Programação Orientada a Objetos", "Prof. João");

        // Agregação
        d.matricularAluno(a1);
        d.matricularAluno(a2);

        // Composição - criar avaliação
        d.criarAvaliacao(1, "Prova Semestral");

        // Pegando a avaliação criada
        Avaliacao av = d.getAvaliacoes().get(0);

        // Composição aninhada - adicionar questões
        av.adicionarQuestao(1, "Explique o que é Encapsulamento", 2.0f);
        av.adicionarQuestao(2, "O que é Herança em POO?", 3.0f);
        av.adicionarQuestao(3, "Explique Polimorfismo com exemplo", 5.0f);

        // Mostrar toda estrutura
        System.out.println(d);
    }
}