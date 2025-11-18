package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoPizzaTest {

    @Test
    void deveRetornarErro(){
        try{
            PedidoPizza pizza = new PedidoPizza();
            pizza.setQuantItems(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Insira um valor válido de itens.", e.getMessage());
        }
    }

    @Test
    void deveRetornarInfoPizza(){
        PedidoPizza pizza = new PedidoPizza();
        pizza.setQuantItems(2);
        pizza.setTipo("Calabresa");
        assertEquals("Pizza{Preço:60.0, Quantidade de Itens adicionados:2, Sabor/Opção:Calabresa', Custo adicional:10.0}", pizza.getInfo());
    }

}