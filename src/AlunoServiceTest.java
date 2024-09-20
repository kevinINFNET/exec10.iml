import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoServiceTest {

    private AlunoService alunoService;
    private List<Aluno> mockListaAlunos;

    @BeforeEach
    public void setUp() {
        alunoService = new AlunoService();
        mockListaAlunos = Arrays.asList(
                new Aluno(1, "Kevin Nunes", 8.0, 7.5),
                new Aluno(2, "Maria Oliveira", 9.0, 6.5),
                new Aluno(3, "Carlos Souza", 5.5, 6.0)
        );
    }
    @Test
    public void testBuscarAlunoPorMatriculaEncontrado() {
        Aluno aluno = alunoService.buscarAlunoPorMatricula(mockListaAlunos, 2);
        assertNotNull(aluno);
        assertEquals(2, aluno.getMatricula());
        assertEquals("Maria Oliveira", aluno.getNome());
    }
    @Test
    public void testBuscarAlunoPorMatriculaNaoEncontrado() {
        Aluno aluno = alunoService.buscarAlunoPorMatricula(mockListaAlunos, 4);
        assertNull(aluno);
    }

    @Test
    public void testBuscarAlunoComListaVazia() {
        List<Aluno> listaVazia = Arrays.asList();
        Aluno aluno = alunoService.buscarAlunoPorMatricula(listaVazia, 1);
        assertNull(aluno);
    }
}