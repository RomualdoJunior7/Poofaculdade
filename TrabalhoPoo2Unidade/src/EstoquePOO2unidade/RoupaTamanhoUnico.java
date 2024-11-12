package EstoquePOO2unidade;

public class RoupaTamanhoUnico extends Peca_de_Roupa {
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

   
    public void venda() {
        if (quantidade > 0) {
            quantidade--;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
