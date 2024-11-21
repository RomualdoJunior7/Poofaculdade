package EstoquePOO2unidade;

import java.util.Scanner;

public class Acessorios extends Peca_de_Roupa {
    public Acessorios(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda(Scanner scanner) {
        System.out.print("Quantidade vendida de " + descricao + ": ");
        if (scanner.hasNextInt()) {
            int quantidadeVendida = scanner.nextInt();
            if (quantidadeVendida <= quantidade) {
                quantidade -= quantidadeVendida;
                System.out.println("Venda realizada com sucesso.");
            } else {
                System.out.println("Estoque insuficiente.");
            }
        } else {
            System.out.println("Entrada inválida.");
            scanner.next(); 
        }
    }
}
