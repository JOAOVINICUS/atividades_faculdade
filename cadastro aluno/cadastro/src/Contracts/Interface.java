package Contracts;

import Models.Alunos;

public interface Interface {
    void listar();

    void adicionar(Alunos aluno);

    void buscar(String nome);

    void remover(String nome);
}