package Models;

import Execeptions.MatriculainvalidaExeception;

public class Alunos {

    private String nome;
    private String matricula;

    // SETTERS E GETTERS

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void validarMatricula(String matricula) throws MatriculainvalidaExeception {
        if (matricula.length() != 10) {
            throw new MatriculainvalidaExeception("Matrícula inválida!");
        }
    }

    // CONSTRUTOR
    public Alunos(String nome, String matricula) {
        try {
            validarMatricula(matricula);
            setMatricula(matricula);
            setNome(nome);
        } catch (MatriculainvalidaExeception e) {
            System.out.println(e.getMessage());
        }
    }
}