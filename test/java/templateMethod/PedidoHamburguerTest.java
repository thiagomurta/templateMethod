package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoHamburguerTest {

    @Test
    void deveRetornarErro(){
        try{
            PedidoHamburguer hamburguer = new PedidoHamburguer();
            hamburguer.setQuantItems(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Insira um valor válido de itens.", e.getMessage());
        }
    }

    @Test
    void deveRetornarInfoHamburguer(){
        PedidoHamburguer hamburguer = new PedidoHamburguer();
        hamburguer.setQuantItems(3);
        hamburguer.setTipo("X-Burguer");
        assertEquals("Hambúrguer{Preço:29.0, Quantidade de Itens adicionados:3, Sabor/Opção:X-Burguer', Custo adicional:9.0}", hamburguer.getInfo());
    }

}