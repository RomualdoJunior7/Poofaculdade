package EstoquePOO2unidade;

import java.util.Scanner;

public class Acessorios extends Peca_de_Roupa{
    public Acessorios(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

 
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade vendida de " + descricao + ": ");
        int quantidadeVendida = scanner.nextInt();
        
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
