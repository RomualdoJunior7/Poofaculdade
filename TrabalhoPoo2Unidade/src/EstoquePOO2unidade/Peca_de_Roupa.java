package EstoquePOO2unidade;

public abstract class Peca_de_Roupa {
    protected String descricao;
    protected int quantidade = 0;
    protected int estoqueMinimo = 10;
    protected int estoqueMaximo = 50;
    private int quantidadeVendida = 0;

    public Peca_de_Roupa(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public abstract int venda(java.util.Scanner scanner);

    public void adicionarVenda(int quantidade) {
        this.quantidadeVendida += quantidade;
    }

    public void reposicaoEstoque() {
        if (quantidade < estoqueMinimo) {
            System.out.println("Estoque de " + this.descricao + " precisa ser reposto.");
            quantidade = estoqueMaximo;
            System.out.println("Estoque de " + this.descricao + " foi reposto ao máximo.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public int getEstoqueMax() {
        return estoqueMaximo;
    }
}
