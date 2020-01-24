package br.com.tt.comunicador.model;

import br.com.tt.comunicador.enumerations.EstadoEnum;

import java.time.LocalDate;

public class Usuario {
    private String username;
    private String nome;
    EstadoEnum estado;
    private LocalDate nascimento;

    public Usuario(String username, String nome, EstadoEnum estado, LocalDate nascimento){
        this.username = username;
        this.nome = nome;
        this.estado = estado;
        this.nascimento = nascimento;

    }

    public int idade(){
        return LocalDate.now().getYear() - nascimento.getYear();

    }

    public EstadoEnum getEstadoEnum() {
        return estado;
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
