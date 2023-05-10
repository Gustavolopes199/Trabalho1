package org.example;

import java.time.LocalDate;
import java.util.Date;



public class InfUsuario {

    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;

    private String endereco;
    private String cep;
    private LocalDate data_cadastro;

    private String matricula;
    private boolean funcionario;
    private boolean aluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }


    public InfUsuario() {
    }

    public InfUsuario(int id, String nome, String sobrenome, String cpf, String endereco, String cep, LocalDate data_cadastro, String matricula, boolean funcionario, boolean aluno) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.data_cadastro = data_cadastro;
        this.matricula = matricula;
        this.funcionario = funcionario;
        this.aluno = aluno;
    }
}
