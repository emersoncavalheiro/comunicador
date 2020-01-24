package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.enumerations.EstadoEnum;
import br.com.tt.comunicador.exceptions.EstadoInexistenteException;
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
    void deveriaEntrarComSucesso() throws EstadoInexistenteException {
        //Preparação - Arrange
        Mockito.when(util.read()).thenReturn("emersoncv").thenReturn("Emerson").thenReturn("RS").thenReturn("01/02/1995");

        //Ação - Act
        Usuario usuario = new MenuEntrar(util).entrar();

        //Verificação - Assert
        LocalDate nascimentoEsperado = LocalDate.of(1995, 02, 01);
        assertEquals("emersoncv", usuario.getUsername());
        assertEquals("Emerson", usuario.getNome());
        assertEquals("RS", usuario.getEstadoEnum().name());
        assertEquals("Rio Grande do Sul", usuario.getEstadoEnum().getDescricao());
        assertEquals(nascimentoEsperado, usuario.getNascimento());

        Mockito.verify(util, Mockito.times(4)).read();

    }

}