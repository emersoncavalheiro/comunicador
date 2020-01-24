package br.com.tt.comunicador.enumerations;

public enum EstadoEnum {
    RS("Rio Grande do Sul"),
    SC("Santa Catarina"),
    PR("Paraná"),
    MT("Mato Grosso");

    private String descricao;

    EstadoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}