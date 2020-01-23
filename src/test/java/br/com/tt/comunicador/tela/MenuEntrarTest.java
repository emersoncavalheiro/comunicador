package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class MenuEntrarTest {

    @Mock
    Util util;

    @Test
    void deveriaEntrarComSucesso(){
        //Preparação - Arrange
        Mockito.when(util.read()).thenReturn("emersoncv").thenReturn("Emerson").thenReturn("01/02/1995");

        //Ação - Act
        Usuario usuario = new MenuEntrar(util).entrar();

        //Verificação - Assert
        LocalDate nascimentoEsperado = LocalDate.of(1995, 02, 01);
        assertEquals("emersoncv", usuario.getUsername());
        assertEquals("Emerson", usuario.getNome());
        assertEquals(nascimentoEsperado, usuario.getNascimento());

        Mockito.verify(util, Mockito.times(3)).read();

    }


}