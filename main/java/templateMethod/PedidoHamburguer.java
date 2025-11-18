package templateMethod;

public class PedidoHamburguer extends Pedido{
    @Override
    public float precoPedido(){
        return 20.0f + calculaAdicaoItem();
    }

    @Override
    public float calculaAdicaoItem() {
        return this.quantItems * 3;
    }

    public String getTipo(){
        return "Hambúrguer";
    }
}
