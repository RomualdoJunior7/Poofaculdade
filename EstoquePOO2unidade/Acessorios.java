package EstoquePOO2unidade;

import java.util.Scanner;

public class Acessorios extends Peca_de_Roupa {
    public Acessorios(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public int venda(Scanner scanner) {
        System.out.println("Estoque disponível: " + quantidade);
        System.out.print("Quantidade vendida de " + descricao + ": ");
        if (scanner.hasNextInt()) {
            int quantidadeVendida = scanner.nextInt();
            if (quantidadeVendida > 0 && quantidadeVendida <= quantidade) {
                quantidade -= quantidadeVendida;
                System.out.println("Venda realizada com sucesso.");
                return quantidadeVendida;
            } else {
                System.out.println("Estoque insuficiente ou valor inválido.");
            }
        } else {
            System.out.println("Entrada inválida.");
            scanner.next();
        }
        return 0;
    }
}
