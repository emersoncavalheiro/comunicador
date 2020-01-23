package br.com.tt.comunicador.model;

import java.time.LocalDate;

public class Usuario {
    private String username;
    private String nome;
    private LocalDate nascimento;

    public Usuario(String username, String nome, LocalDate nascimento){
        this.username = username;
        this.nome = nome;
        this.nascimento = nascimento;

    }

    public int idade(){
        return LocalDate.now().getYear() - nascimento.getYear();

    }

    public String getUsername() {
        return username;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
