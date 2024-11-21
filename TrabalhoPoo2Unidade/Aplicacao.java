package EstoquePOO2unidade;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Peca_de_Roupa[] estoque = new Peca_de_Roupa[5];
        estoque[0] = new Acessorios("Cinto", 20, 5, 50);
        estoque[1] = new RoupaTamanhoUnico("Saia", 15, 5, 20);
        estoque[2] = new Acessorios("Pulseira", 30, 5, 40);
        estoque[3] = new RoupaPMG("Camisa", 10, 10, 10, 5, 15);
        estoque[4] = new RoupaTamanhoUnico("Saída de praia", 10, 5, 15);

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = -1;

            do {
                System.out.println("\nEscolha uma opção:");
                for (int i = 0; i < estoque.length; i++) {
                    System.out.println(i + " - " + estoque[i].getDescricao());
                }
                System.out.println("5 - Sair do sistema");

                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();

                    if (opcao >= 0 && opcao < estoque.length) {
                        estoque[opcao].venda(scanner);
                        estoque[opcao].reposicaoEstoque();
                    } else if (opcao != 5) {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                } else {
                    System.out.println("Por favor, insira um número válido.");
                    scanner.next();
                }
            } while (opcao != 5);

            System.out.println("\nEstoque final:");
            for (Peca_de_Roupa p : estoque) {
                System.out.println(p.getDescricao() + ": " + p.getQuantidade() + " unidades.");
            }
        }
    }
}
