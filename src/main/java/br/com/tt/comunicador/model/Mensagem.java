package br.com.tt.comunicador.model;

import br.com.tt.comunicador.exceptions.TamanhoMensagemInvalidoException;

import java.time.LocalDateTime;

public class Mensagem {
    private static final int TAMANHO_MINIMO_MENSAGEM = 5;

    private String texto;
    private LocalDateTime dataHora;

    public Mensagem(String texto) throws TamanhoMensagemInvalidoException {
        verificaTamanhoMinimo(texto);
        this.texto = texto;
        this.dataHora = LocalDateTime.now();
    }

    private void verificaTamanhoMinimo(String texto) throws TamanhoMensagemInvalidoException {
        if(texto == null || texto.length() < TAMANHO_MINIMO_MENSAGEM){
            throw new TamanhoMensagemInvalidoException("Erro: Tamanho mínino da mensagem: " + TAMANHO_MINIMO_MENSAGEM);
        }
    }

    public String getDescricao() {
        return "Mensagem Enviada em "
                + dataHora +
                ": " + texto;
    }

}
