package templateMethod;

public abstract class Pedido {
    public String opcao;
    public int quantItems;

    public String getTipo() {
        return opcao;
    }

    public void setTipo(String opcao) {
        this.opcao = opcao;
    }

    public int getQuantItems() {
        return quantItems;
    }

    public void setQuantItems(int quantItems) {
        if(quantItems < 0){
            throw new IllegalArgumentException("Insira um valor válido de itens.");
        }
        this.quantItems = quantItems;
    }

    public abstract float precoPedido();

    public abstract float calculaAdicaoItem();

    public String getInfo(){
        return getTipo() + "{" +
                "Preço:" + this.precoPedido() +
                ", Quantidade de Itens adicionados:" + this.quantItems +
                ", Sabor/Opção:" + this.opcao + '\'' +
                ", Custo adicional:" + this.calculaAdicaoItem() +
                '}';
    }
}
