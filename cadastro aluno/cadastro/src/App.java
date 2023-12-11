import Models.Alunos;
import Contracts.Interface;
import Repositories.IAlunoRepository;

public class App {
    public static void main(String[] args) {

        Alunos aluno1 = new Alunos("Marcelo", "0000000001");
        Alunos aluno2 = new Alunos("Roberta", "0000000002");
        Alunos aluno3 = new Alunos("Clara", "0000000003");
        Alunos aluno4 = new Alunos("Cleide", "0000000004");
        Alunos aluno5 = new Alunos("Fernanda", "0000000005");

        IAlunoRepository repositorio = new IAlunoRepository();

        repositorio.adicionar(aluno1);
        repositorio.adicionar(aluno2);
        repositorio.adicionar(aluno3);
        repositorio.adicionar(aluno4);
        repositorio.adicionar(aluno5);

        repositorio.buscar("Cleide");

    }
}