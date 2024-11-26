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
		System.out.println("Estoque disponível: P=" + quantidadeP + ", M=" + quantidadeM + ", G=" + quantidadeG);
		System.out.print("Escolha o tamanho (P, M, G): ");
		String tamanho = scanner.next().toUpperCase();
		int quantidadeVendida = 0;

		switch (tamanho) {
		case "P":
			if (quantidadeP > 0) {
				quantidadeP--;
				quantidade--;
				quantidadeVendida = 1;
				System.out.println("Venda de tamanho P realizada com sucesso.");
			} else {
				System.out.println("Estoque insuficiente para P.");
			}
			break;
		case "M":
			if (quantidadeM > 0) {
				quantidadeM--;
				quantidade--;
				quantidadeVendida = 1;
				System.out.println("Venda de tamanho M realizada com sucesso.");
			} else {
				System.out.println("Estoque insuficiente para M.");
			}
			break;
		case "G":
			if (quantidadeG > 0) {
				quantidadeG--;
				quantidade--;
				quantidadeVendida = 1;
				System.out.println("Venda de tamanho G realizada com sucesso.");
			} else {
				System.out.println("Estoque insuficiente para G.");
			}
			break;
		default:
			System.out.println("Tamanho inválido.");
		}
		return quantidadeVendida;
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
