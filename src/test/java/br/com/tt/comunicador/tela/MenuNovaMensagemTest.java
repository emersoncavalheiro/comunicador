package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.exceptions.TamanhoMensagemInvalidoException;
import br.com.tt.comunicador.model.Mensagem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class MenuNovaMensagemTest {

    @Mock
    Util util;
    MenuNovaMensagem menuNovaMensagem;

    @BeforeEach
    void inicializa(){
        menuNovaMensagem = new MenuNovaMensagem(util);
    }

    @Test
    void deveriaCriarNovaMensagem(){
        //Preparação - Arrange
        Mockito.when(util.read()).thenReturn("Mensagem1");

        //Ação - Act
        Mensagem msg = menuNovaMensagem.novaMensagem();

        //Verificação - Assert
        assertNotNull(msg);
        assertEquals("Mensagem1" , msg.getTexto());

        Mockito.verify(util, Mockito.times(1)).read();

    }

    @Test
    void deveriaFalharTamanhoMinimo(){
        //Preparação - Arrange
        Mockito.when(util.read()).thenReturn("");

        //Ação - Act
        Mensagem retorno = menuNovaMensagem.novaMensagem();

        //Verificação - Assert
        assertNull(retorno);

    }



}