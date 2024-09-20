import java.util.List;

public class AlunoService {

    public Aluno buscarAlunoPorMatricula(List<Aluno> alunos, int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
}
