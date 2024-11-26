package EstoquePOO2unidade;

import java.util.Scanner;

public class RoupaPMG extends Peca_de_Roupa {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
            int estoqueMaximo) {
        super(descricao, quantidadeP + quantidadeM + quantidadeG, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }
    public int venda(Scanner scanner) {
        System.out.println("Estoque disponível:");
        System.out.println("P: " + quantidadeP + " unidades");
        System.out.println("M: " + quantidadeM + " unidades");
        System.out.println("G: " + quantidadeG + " unidades");

        System.out.print("Escolha o tamanho (P, M, G): ");
        String tamanho = scanner.next().toUpperCase();

        System.out.print("Quantidade desejada: ");
        if (scanner.hasNextInt()) {
            int quantidadeDesejada = scanner.nextInt();
            if (quantidadeDesejada > 0) {
                switch (tamanho) {
                    case "P":
                        if (quantidadeDesejada <= quantidadeP) {
                            quantidadeP -= quantidadeDesejada;
                            quantidade -= quantidadeDesejada;
                            System.out.println("Venda de tamanho P realizada com sucesso.");
                            return quantidadeDesejada;
                        } else {
                            System.out.println("Estoque insuficiente para P.");
                        }
                        break;

                    case "M":
                        if (quantidadeDesejada <= quantidadeM) {
                            quantidadeM -= quantidadeDesejada;
                            quantidade -= quantidadeDesejada;
                            System.out.println("Venda de tamanho M realizada com sucesso.");
                            return quantidadeDesejada;
                        } else {
                            System.out.println("Estoque insuficiente para M.");
                        }
                        break;

                    case "G":
                        if (quantidadeDesejada <= quantidadeG) {
                            quantidadeG -= quantidadeDesejada;
                            quantidade -= quantidadeDesejada;
                            System.out.println("Venda de tamanho G realizada com sucesso.");
                            return quantidadeDesejada;
                        } else {
                            System.out.println("Estoque insuficiente para G.");
                        }
                        break;

                    default:
                        System.out.println("Tamanho inválido.");
                }
            } else {
                System.out.println("A quantidade deve ser maior que 0.");
            }
        } else {
            System.out.println("Entrada inválida.");
            scanner.next(); 
        }
        return 0; 
    }

    public void reposicaoEstoque() {
        if (quantidadeP < estoqueMinimo)
            quantidadeP = estoqueMaximo;
        if (quantidadeM < estoqueMinimo)
            quantidadeM = estoqueMaximo;
        if (quantidadeG < estoqueMinimo)
            quantidadeG = estoqueMaximo;
        quantidade = quantidadeP + quantidadeM + quantidadeG;
    }
}
