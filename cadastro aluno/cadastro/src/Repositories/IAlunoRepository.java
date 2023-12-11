package Repositories;

import Contracts.Interface;

import java.util.ArrayList; // import the ArrayList class
import Models.Alunos;
import Execeptions.*;

public class IAlunoRepository implements Interface {
    ArrayList<Alunos> Alunos = new ArrayList<Alunos>();

    public void listar() {
        for (Alunos aluno : Alunos) {
            System.out.println(aluno.getNome() + " : " + aluno.getMatricula());
        }
    }

    public void adicionar(Alunos aluno) {
        Alunos.add(aluno);
    }

    // return>-1 achou o aluno ----- return < 0 não achou
    public int busca(String nome) {
        for (Alunos aluno : Alunos) {
            if (aluno.getNome().equals(nome)) {
                return Alunos.indexOf(aluno);
            }
        }
        return -1;
    }

    public void remover(String nome) {
        int busca = this.busca(nome);
        if (busca > -1) {
            Alunos.remove(Alunos.get(busca));
            System.out.println("Aluno removido com sucesso!");
            System.out.println("Alunos Restantes:");
            this.listar();
        } else {
            System.out.println("Aluno não cadastrado no sistema!");
        }
    }

    public int index_Of(String nome) throws Alunonaoencontradoexception {
        int indice = this.busca(nome);
        if (indice == -1) {
            throw new Alunonaoencontradoexception("Aluno não encontrado no sistema!");
        }
        return indice;
    }

    public void buscar(String nome) {
        try {
            int indice = this.index_Of(nome);
            System.out.println("Aluno cadastrado no sistema!");
        } catch (Alunonaoencontradoexception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}