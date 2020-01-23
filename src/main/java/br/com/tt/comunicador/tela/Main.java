package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.model.Mensagem;
import br.com.tt.comunicador.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Usuario usuarioLogado;

    private static List<Mensagem> mensagens;

    private static Util util = new Util();
    private static MenuEntrar menuEntrar = new MenuEntrar(util);

    private static MenuNovaMensagem menuNovaMensagem = new MenuNovaMensagem(util);



    public static void main(String[] args){
        mensagens = new ArrayList<>();
        usuarioLogado = menuEntrar.entrar();
        do {
            Mensagem mensagem = menuNovaMensagem.novaMensagem();

            if(mensagem != null) {
                mensagens.add(mensagem);
            }

            util.print("Deseja sair? (S/N)");
            String resposta = util.read();

            if("S".equals(resposta)){
                break;
            }
        }while(true);

        listarMensagens();

    }

    private static void listarMensagens(){
        String descricoes = new String();
        for(int c=0; c < mensagens.size(); c++){
            Mensagem msg = mensagens.get(c);
            descricoes += msg.getDescricao() + "\n";
        }
        util.print(descricoes);

    }

}

