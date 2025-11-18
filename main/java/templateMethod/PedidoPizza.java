package templateMethod;

public class PedidoPizza extends Pedido {
    @Override
    public float precoPedido(){
        return 50.0f + calculaAdicaoItem();
    }

    @Override
    public float calculaAdicaoItem() {
        return this.quantItems * 5;
    }

    public String getTipo(){
        return "Pizza";
    }
}
