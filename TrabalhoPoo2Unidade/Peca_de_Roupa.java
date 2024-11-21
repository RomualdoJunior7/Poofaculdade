package EstoquePOO2unidade;

public abstract class Peca_de_Roupa {
    protected String descricao;
    protected int quantidade = 0;
    protected int estoqueMinimo = 10;
    protected int estoqueMaximo = 30;

    public Peca_de_Roupa(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public abstract void venda(java.util.Scanner scanner);

    public void reposicaoEstoque() {
        if (quantidade < estoqueMinimo) {
            quantidade = estoqueMaximo;
            System.out.println("Estoque de " + descricao + " foi reposto ao máximo.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
