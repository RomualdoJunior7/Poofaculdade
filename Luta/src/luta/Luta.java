package luta;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rouds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.desafiado = null;
			this.aprovada = false;
			this.desafiante = null;
		}

	}

	public void Lutar() {
		if (this.aprovada) {
			System.out.println("Desafiado: ");
			this.desafiado.apresentar();
			System.out.println("Desafiante: ");
			this.desafiante.apresentar();

			Random time = new Random();
			int vencedor = time.nextInt(3);

			System.out.println("====== Resultado ======");
			switch (vencedor) {
			case 0:
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Magnífico!");
				System.out.println("Vitória do: " + this.desafiado.getNome());
				this.desafiado.ganharluta();
				this.desafiante.PerderLuta();
				break;
			case 2:
				System.out.println("Magnífico!");
				System.out.println("Vitória do: " + this.desafiante.getNome());
				this.desafiante.ganharluta();
				this.desafiado.PerderLuta();
				break;
			}
			System.out.println("==============================");
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRouds() {
		return rouds;
	}

	public void setRouds(int rouds) {
		this.rouds = rouds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}

}
