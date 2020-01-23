package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.exceptions.TamanhoMensagemInvalidoException;
import br.com.tt.comunicador.model.Mensagem;

class MenuNovaMensagem {
    private Util util;

    MenuNovaMensagem(Util util){
        this.util = util;

    }

    Mensagem novaMensagem() {
        util.print("Mensagem: ");
        String texto = util.read();
        try {
            Mensagem mensagem = new Mensagem(texto);
            return mensagem;
        } catch (TamanhoMensagemInvalidoException e) {
            System.err.println(e);
            util.print(e.getMessage());
            return null;
        }

    }
}